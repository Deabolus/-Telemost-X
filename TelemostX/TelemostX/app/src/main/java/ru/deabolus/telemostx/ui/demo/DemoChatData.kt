package ru.deabolus.telemostx.ui.demo

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class DemoChat(
    val id: String,
    val title: String,
    val initials: String,
    val messages: MutableList<DemoMessage>
) {
    fun lastMessagePreview(): String = messages.lastOrNull()?.text ?: "Нет сообщений"

    fun lastMessageTime(): String = messages.lastOrNull()?.time.orEmpty()
}

data class DemoMessage(
    val id: String,
    val senderName: String,
    val text: String,
    val time: String,
    val isOutgoing: Boolean,
    val status: String? = null
)

object DemoChatData {
    val chats: MutableList<DemoChat> = mutableListOf(
        DemoChat(
            id = "demo-team",
            title = "Демо: Команда",
            initials = "К",
            messages = mutableListOf(
                DemoMessage("team-1", "Алекс", "Проверяем отображение списка и истории.", "10:14", false),
                DemoMessage("team-2", "Вы", "Это демонстрационная переписка.", "10:16", true, "Демо")
            )
        ),
        DemoChat(
            id = "demo-plans",
            title = "Демо: Планы",
            initials = "П",
            messages = mutableListOf(
                DemoMessage("plans-1", "Сэм", "Здесь показан пример длинного сообщения, которое переносится по строкам.", "09:42", false)
            )
        ),
        DemoChat(
            id = "demo-notes",
            title = "Демо: Заметки",
            initials = "З",
            messages = mutableListOf(
                DemoMessage("notes-1", "Вы", "Все сообщения на экране — локальные примеры.", "Вчера", true, "Демо")
            )
        )
    )

    private var localMessageNumber = 0

    fun newLocalMessage(chatId: String, text: String): DemoMessage {
        localMessageNumber += 1
        val time = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
        return DemoMessage(
            id = "$chatId-local-$localMessageNumber",
            senderName = "Вы",
            text = text,
            time = time,
            isOutgoing = true,
            status = "Не отправлено"
        )
    }
}
