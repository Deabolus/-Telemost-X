package ru.deabolus.telemostx

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

class MainActivity : Activity() {
    private val bg = Color.rgb(16, 18, 24)
    private val panel = Color.rgb(27, 30, 39)
    private val muted = Color.rgb(157, 164, 178)
    private val accent = Color.rgb(139, 167, 255)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = bg
        window.navigationBarColor = bg
        window.decorView.systemUiVisibility = 0

        val content = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(22), dp(30), dp(22), dp(24))
            setBackgroundColor(bg)
        }

        content.addView(label("TELEMOST X", 13, accent, true))
        content.addView(space(18))
        content.addView(label("Чаты — отдельный клиент", 26, Color.WHITE, true))
        content.addView(space(10))
        content.addView(label(
            "Начальная инженерная сборка. Сейчас приложение запускается локально, " +
                "но ещё не подключено к серверам Яндекс Телемоста.",
            15, muted, false
        ))
        content.addView(space(22))

        val status = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(16), dp(16), dp(16))
            setBackgroundColor(panel)
        }
        status.addView(label("Состояние проекта", 17, Color.WHITE, true))
        status.addView(space(12))
        status.addView(statusLine("Интерфейс приложения", "Есть", true))
        status.addView(statusLine("Авторизация Телемоста", "Не реализована", false))
        status.addView(statusLine("Получение и отправка сообщений", "Не реализовано", false))
        status.addView(statusLine("Скрытие прочтения / SeenMarker", "Исследуется", false))
        status.addView(statusLine("Скрытие онлайн-статуса", "Исследуется", false))
        status.addView(statusLine("Отключение индикатора набора", "Не реализовано", false))
        content.addView(status)

        content.addView(space(22))
        content.addView(label("Почему пока нет списка чатов?", 18, Color.WHITE, true))
        content.addView(space(8))
        content.addView(label(
            "Для настоящего списка нужен рабочий протокол сессии и обмена сообщениями. " +
                "Подменять его демонстрационными переписками или неработающими переключателями было бы нечестно.",
            14, muted, false
        ))
        content.addView(space(22))
        content.addView(label(
            "Следующий этап: изучение клиентского протокола и проверка поведения приватности " +
                "на тестовых аккаунтах. До такой проверки нельзя обещать, что сервер примет " +
                "отключение отметок прочтения или присутствия.",
            14, muted, false
        ))

        val scroll = ScrollView(this).apply { addView(content) }
        setContentView(scroll)
    }

    private fun statusLine(name: String, value: String, done: Boolean): View {
        val row = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(0, dp(6), 0, dp(6))
        }
        val left = TextView(this).apply {
            text = name
            textSize = 14f
            setTextColor(Color.WHITE)
        }
        val right = TextView(this).apply {
            text = value
            textSize = 12f
            setTextColor(if (done) accent else muted)
            gravity = Gravity.END
        }
        row.addView(left, LinearLayout.LayoutParams(0, -2, 1f))
        row.addView(right)
        return row
    }

    private fun label(textValue: String, size: Int, color: Int, bold: Boolean): TextView =
        TextView(this).apply {
            text = textValue
            textSize = size.toFloat()
            setTextColor(color)
            if (bold) setTypeface(typeface, Typeface.BOLD)
            setLineSpacing(dp(3).toFloat(), 1f)
        }

    private fun space(height: Int) = View(this).apply {
        layoutParams = LinearLayout.LayoutParams(1, dp(height))
    }

    private fun dp(value: Int): Int = (value * resources.displayMetrics.density).toInt()
}
