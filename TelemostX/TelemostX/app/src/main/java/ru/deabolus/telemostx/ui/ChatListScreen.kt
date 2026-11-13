package ru.deabolus.telemostx.ui

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.GradientDrawable
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import ru.deabolus.telemostx.ui.demo.DemoChat

class ChatListScreen(
    context: Context,
    chats: List<DemoChat>,
    selectedChatId: String?,
    onChatSelected: (DemoChat) -> Unit
) : LinearLayout(context) {
    init {
        orientation = VERTICAL
        setBackgroundColor(UiStyle.background)

        val header = LinearLayout(context).apply {
            orientation = VERTICAL
            setPadding(UiStyle.dp(context, 22), UiStyle.dp(context, 22), UiStyle.dp(context, 22), 0)
        }
        header.addView(
            UiStyle.label(context, "TELEMOST X", 12f, UiStyle.accent, bold = true)
        )
        header.addView(
            UiStyle.label(context, "Чаты", 28f, UiStyle.textPrimary, bold = true).apply {
                setPadding(0, UiStyle.dp(context, 8), 0, UiStyle.dp(context, 14))
            }
        )
        header.addView(UiStyle.demoBanner(context))
        addView(header, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT))

        val scrollView = ScrollView(context).apply {
            isFillViewport = true
            overScrollMode = View.OVER_SCROLL_NEVER
        }
        val list = LinearLayout(context).apply {
            orientation = VERTICAL
            setPadding(
                UiStyle.dp(context, 18),
                UiStyle.dp(context, 16),
                UiStyle.dp(context, 18),
                UiStyle.dp(context, 24)
            )
        }
        if (chats.isEmpty()) {
            list.addView(
                UiStyle.label(context, "Демо-чаты не добавлены", 15f, UiStyle.textMuted)
            )
        } else {
            chats.forEach { chat ->
                list.addView(
                    chatRow(context, chat, chat.id == selectedChatId, onChatSelected),
                    LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT).apply {
                        bottomMargin = UiStyle.dp(context, 10)
                    }
                )
            }
        }
        scrollView.addView(
            list,
            FrameLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )
        addView(scrollView, LayoutParams(LayoutParams.MATCH_PARENT, 0, 1f))
    }

    private fun chatRow(
        context: Context,
        chat: DemoChat,
        selected: Boolean,
        onChatSelected: (DemoChat) -> Unit
    ): View {
        val row = LinearLayout(context).apply {
            orientation = HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 14),
                UiStyle.dp(context, 14)
            )
            background = UiStyle.rounded(
                context,
                if (selected) UiStyle.selectedSurface else UiStyle.surface,
                18f
            )
            isClickable = true
            isFocusable = true
            contentDescription = "${chat.title}, демо-чат"
            setOnClickListener { onChatSelected(chat) }
        }

        val avatar = TextView(context).apply {
            text = chat.initials
            textSize = 14f
            typeface = Typeface.DEFAULT_BOLD
            gravity = Gravity.CENTER
            setTextColor(UiStyle.textPrimary)
            background = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(UiStyle.avatarSurface)
            }
        }
        row.addView(
            avatar,
            LayoutParams(UiStyle.dp(context, 48), UiStyle.dp(context, 48))
        )

        val details = LinearLayout(context).apply {
            orientation = VERTICAL
            setPadding(UiStyle.dp(context, 12), 0, 0, 0)
        }
        val titleLine = LinearLayout(context).apply {
            orientation = HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }
        val title = UiStyle.label(context, chat.title, 16f, UiStyle.textPrimary, bold = true).apply {
            maxLines = 1
            ellipsize = TextUtils.TruncateAt.END
        }
        titleLine.addView(title, LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f))
        titleLine.addView(
            UiStyle.label(context, chat.lastMessageTime(), 12f, UiStyle.textMuted)
                .apply { gravity = Gravity.END }
        )
        details.addView(titleLine)
        details.addView(
            UiStyle.label(context, chat.lastMessagePreview(), 13f, UiStyle.textMuted).apply {
                maxLines = 1
                ellipsize = TextUtils.TruncateAt.END
                setPadding(0, UiStyle.dp(context, 5), 0, 0)
            }
        )
        row.addView(details, LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f))
        return row
    }
}

internal object UiStyle {
    val background: Int = Color.rgb(16, 18, 24)
    val surface: Int = Color.rgb(27, 30, 39)
    val selectedSurface: Int = Color.rgb(39, 44, 58)
    val avatarSurface: Int = Color.rgb(53, 61, 81)
    val divider: Int = Color.rgb(44, 48, 59)
    val accent: Int = Color.rgb(139, 167, 255)
    val accentSurface: Int = Color.rgb(44, 53, 77)
    val textPrimary: Int = Color.WHITE
    val textMuted: Int = Color.rgb(157, 164, 178)
    val demoText: Int = Color.rgb(241, 196, 120)
    val demoSurface: Int = Color.rgb(48, 39, 30)

    fun dp(context: Context, value: Int): Int =
        (value * context.resources.displayMetrics.density).toInt()

    fun label(
        context: Context,
        value: String,
        sizeSp: Float,
        color: Int,
        bold: Boolean = false
    ): TextView =
        TextView(context).apply {
            text = value
            textSize = sizeSp
            setTextColor(color)
            if (bold) setTypeface(typeface, Typeface.BOLD)
            setLineSpacing(dp(context, 2).toFloat(), 1f)
        }

    fun rounded(context: Context, color: Int, radiusDp: Float): GradientDrawable =
        GradientDrawable().apply {
            setColor(color)
            cornerRadius = dp(context, radiusDp.toInt()).toFloat()
        }

    fun demoBanner(context: Context): TextView =
        label(context, "ДЕМО · локальные данные", 12f, demoText, bold = true).apply {
            gravity = Gravity.CENTER_VERTICAL
            setPadding(dp(context, 12), dp(context, 10), dp(context, 12), dp(context, 10))
            background = rounded(context, demoSurface, 12f)
        }
}
