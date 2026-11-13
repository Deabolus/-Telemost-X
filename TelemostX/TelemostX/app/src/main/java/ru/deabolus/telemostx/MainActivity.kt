package ru.deabolus.telemostx

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import ru.deabolus.telemostx.ui.ChatListScreen
import ru.deabolus.telemostx.ui.ConversationScreen
import ru.deabolus.telemostx.ui.UiStyle
import ru.deabolus.telemostx.ui.demo.DemoChat
import ru.deabolus.telemostx.ui.demo.DemoChatData
import ru.deabolus.telemostx.ui.demo.DemoMessage

class MainActivity : Activity() {
    private var selectedChatId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = UiStyle.background
        window.navigationBarColor = UiStyle.background
        window.decorView.systemUiVisibility = 0
        render()
    }

    private fun render() {
        val isWide = resources.configuration.screenWidthDp >= 600
        val selectedChat = DemoChatData.chats.firstOrNull { it.id == selectedChatId }

        if (isWide) {
            val root = LinearLayout(this).apply {
                orientation = LinearLayout.HORIZONTAL
                setBackgroundColor(UiStyle.background)
            }
            val chatList = ChatListScreen(
                context = this,
                chats = DemoChatData.chats,
                selectedChatId = selectedChatId,
                onChatSelected = { chat ->
                    selectedChatId = chat.id
                    render()
                }
            )
            val listWidth = UiStyle.dp(
                this,
                (resources.configuration.screenWidthDp * 0.36f).toInt().coerceIn(280, 420)
            )
            root.addView(
                chatList,
                LinearLayout.LayoutParams(listWidth, LinearLayout.LayoutParams.MATCH_PARENT)
            )
            root.addView(
                View(this).apply { setBackgroundColor(UiStyle.divider) },
                LinearLayout.LayoutParams(UiStyle.dp(this, 1), LinearLayout.LayoutParams.MATCH_PARENT)
            )
            val detail = selectedChat?.let { createConversation(it, showBack = false) }
                ?: emptyDetail()
            root.addView(
                detail,
                LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1f)
            )
            setContentView(root)
            return
        }

        if (selectedChat == null) {
            setContentView(
                ChatListScreen(
                    context = this,
                    chats = DemoChatData.chats,
                    selectedChatId = null,
                    onChatSelected = { chat ->
                        selectedChatId = chat.id
                        render()
                    }
                )
            )
        } else {
            setContentView(createConversation(selectedChat, showBack = true))
        }
    }

    private fun createConversation(chat: DemoChat, showBack: Boolean): ConversationScreen {
        lateinit var screen: ConversationScreen
        screen = ConversationScreen(
            context = this,
            chat = chat,
            showBack = showBack,
            onBack = {
                selectedChatId = null
                render()
            },
            onSend = { text ->
                val message = DemoChatData.newLocalMessage(chat.id, text)
                chat.messages.add(message)
                screen.appendMessage(message)
            }
        )
        return screen
    }

    private fun emptyDetail(): View =
        LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(
                UiStyle.dp(this@MainActivity, 24),
                UiStyle.dp(this@MainActivity, 24),
                UiStyle.dp(this@MainActivity, 24),
                UiStyle.dp(this@MainActivity, 24)
            )
            setBackgroundColor(UiStyle.background)
            addView(
                TextView(this@MainActivity).apply {
                    text = "Выберите демо-чат"
                    textSize = 20f
                    setTextColor(UiStyle.textPrimary)
                    gravity = Gravity.CENTER
                }
            )
            addView(
                TextView(this@MainActivity).apply {
                    text = "Переписка останется только в памяти приложения."
                    textSize = 14f
                    setTextColor(UiStyle.textMuted)
                    gravity = Gravity.CENTER
                    setPadding(0, UiStyle.dp(this@MainActivity, 8), 0, 0)
                }
            )
        }

    @Suppress("DEPRECATION")
    override fun onBackPressed() {
        if (selectedChatId != null) {
            selectedChatId = null
            render()
        } else {
            super.onBackPressed()
        }
    }
}
