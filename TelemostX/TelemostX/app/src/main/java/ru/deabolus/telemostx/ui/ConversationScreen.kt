package ru.deabolus.telemostx.ui

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.text.InputType
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import ru.deabolus.telemostx.ui.demo.DemoChat
import ru.deabolus.telemostx.ui.demo.DemoMessage

class ConversationScreen(
    context: Context,
    private val chat: DemoChat,
    showBack: Boolean,
    onBack: () -> Unit,
    private val onSend: (String) -> Unit
) : LinearLayout(context) {
    private val messageColumn = LinearLayout(context)
    private val messageScroll = ScrollView(context)
    private val input = EditText(context)

    init {
        orientation = VERTICAL
        setBackgroundColor(UiStyle.background)

        addView(buildHeader(context, showBack, onBack))
        val banner = UiStyle.demoBanner(context)
        addView(
            banner,
            LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT).apply {
                setMargins(
                    UiStyle.dp(context, 18),
                    UiStyle.dp(context, 4),
                    UiStyle.dp(context, 18),
                    UiStyle.dp(context, 12)
                )
            }
        )

        messageColumn.orientation = VERTICAL
        messageColumn.setPadding(
            UiStyle.dp(context, 18),
            UiStyle.dp(context, 6),
            UiStyle.dp(context, 18),
            UiStyle.dp(context, 14)
        )
        messageScroll.isFillViewport = true
        messageScroll.overScrollMode = View.OVER_SCROLL_NEVER
        messageScroll.addView(
            messageColumn,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )
        addView(messageScroll, LayoutParams(LayoutParams.MATCH_PARENT, 0, 1f))

        addView(buildComposer(context))
        chat.messages.forEach(::addMessageView)
        scrollToLatest()
    }

    fun appendMessage(message: DemoMessage) {
        addMessageView(message)
        input.text.clear()
        scrollToLatest()
    }

    private fun buildHeader(context: Context, showBack: Boolean, onBack: () -> Unit): View {
        val header = LinearLayout(context).apply {
            orientation = HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(
                UiStyle.dp(context, 18),
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 18),
                UiStyle.dp(context, 14)
            )
        }
        if (showBack) {
            val back = Button(context).apply {
                text = "Назад"
                isAllCaps = false
                setTextColor(UiStyle.accent)
                background = UiStyle.rounded(context, UiStyle.surface, 14f)
                setPadding(UiStyle.dp(context, 10), 0, UiStyle.dp(context, 10), 0)
                contentDescription = "Вернуться к списку демо-чатов"
                setOnClickListener { onBack() }
            }
            header.addView(
                back,
                LayoutParams(LayoutParams.WRAP_CONTENT, UiStyle.dp(context, 44)).apply {
                    rightMargin = UiStyle.dp(context, 12)
                }
            )
        }

        val titleBlock = LinearLayout(context).apply {
            orientation = VERTICAL
        }
        titleBlock.addView(
            UiStyle.label(context, chat.title, 18f, UiStyle.textPrimary, bold = true).apply {
                maxLines = 1
                ellipsize = TextUtils.TruncateAt.END
            }
        )
        titleBlock.addView(
            UiStyle.label(context, "Демо-переписка", 12f, UiStyle.textMuted).apply {
                setPadding(0, UiStyle.dp(context, 3), 0, 0)
            }
        )
        header.addView(titleBlock, LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f))
        return header
    }

    private fun buildComposer(context: Context): View {
        val container = LinearLayout(context).apply {
            orientation = VERTICAL
            setPadding(
                UiStyle.dp(context, 16),
                UiStyle.dp(context, 10),
                UiStyle.dp(context, 16),
                UiStyle.dp(context, 12)
            )
            setBackgroundColor(UiStyle.surface)
        }
        container.addView(
            View(context).apply { setBackgroundColor(UiStyle.divider) },
            LayoutParams(LayoutParams.MATCH_PARENT, UiStyle.dp(context, 1)).apply {
                bottomMargin = UiStyle.dp(context, 10)
            }
        )

        val controls = LinearLayout(context).apply {
            orientation = HORIZONTAL
            gravity = Gravity.BOTTOM
        }
        input.apply {
            hint = "Сообщение в демо-чате"
            textSize = 15f
            setTextColor(UiStyle.textPrimary)
            setHintTextColor(UiStyle.textMuted)
            inputType = InputType.TYPE_CLASS_TEXT or
                InputType.TYPE_TEXT_FLAG_CAP_SENTENCES or
                InputType.TYPE_TEXT_FLAG_MULTI_LINE
            minHeight = UiStyle.dp(context, 48)
            maxLines = 4
            setPadding(
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 12),
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 12)
            )
            background = UiStyle.rounded(context, UiStyle.background, 16f)
        }
        controls.addView(input, LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f))

        val send = Button(context).apply {
            text = "Отправить"
            isAllCaps = false
            textSize = 13f
            typeface = Typeface.DEFAULT_BOLD
            setTextColor(Color.rgb(16, 18, 24))
            background = UiStyle.rounded(context, UiStyle.accent, 14f)
            setPadding(UiStyle.dp(context, 12), 0, UiStyle.dp(context, 12), 0)
            contentDescription = "Добавить демо-сообщение локально"
            setOnClickListener {
                val text = input.text.toString().trim()
                if (text.isNotEmpty()) onSend(text)
            }
        }
        controls.addView(
            send,
            LayoutParams(LayoutParams.WRAP_CONTENT, UiStyle.dp(context, 48)).apply {
                leftMargin = UiStyle.dp(context, 8)
            }
        )
        container.addView(controls)
        container.addView(
            UiStyle.label(
                context,
                "Офлайн-демо: сообщение останется в памяти и не уйдёт на сервер.",
                11f,
                UiStyle.textMuted
            ).apply {
                setPadding(UiStyle.dp(context, 2), UiStyle.dp(context, 8), 0, 0)
            }
        )
        return container
    }

    private fun addMessageView(message: DemoMessage) {
        val row = LinearLayout(context).apply {
            orientation = VERTICAL
            gravity = if (message.isOutgoing) Gravity.END else Gravity.START
        }
        val bubble = LinearLayout(context).apply {
            orientation = VERTICAL
            setPadding(
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 10),
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 8)
            )
            background = UiStyle.rounded(
                context,
                if (message.isOutgoing) UiStyle.accentSurface else UiStyle.surface,
                18f
            )
        }
        if (!message.isOutgoing) {
            bubble.addView(
                UiStyle.label(context, message.senderName, 12f, UiStyle.accent, bold = true).apply {
                    setPadding(0, 0, 0, UiStyle.dp(context, 4))
                }
            )
        }
        val body = UiStyle.label(context, message.text, 15f, UiStyle.textPrimary).apply {
            maxWidth = UiStyle.dp(context, 420)
        }
        bubble.addView(body)

        val metadata = LinearLayout(context).apply {
            orientation = HORIZONTAL
            gravity = Gravity.END or Gravity.CENTER_VERTICAL
            setPadding(0, UiStyle.dp(context, 6), 0, 0)
        }
        metadata.addView(UiStyle.label(context, message.time, 11f, UiStyle.textMuted))
        message.status?.let { status ->
            metadata.addView(
                UiStyle.label(context, status, 11f, UiStyle.demoText, bold = true).apply {
                    setPadding(UiStyle.dp(context, 8), 0, 0, 0)
                }
            )
        }
        bubble.addView(metadata)
        row.addView(bubble, LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT))
        messageColumn.addView(
            row,
            LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT).apply {
                bottomMargin = UiStyle.dp(context, 10)
            }
        )
    }

    private fun scrollToLatest() {
        messageScroll.post { messageScroll.fullScroll(View.FOCUS_DOWN) }
    }
}
