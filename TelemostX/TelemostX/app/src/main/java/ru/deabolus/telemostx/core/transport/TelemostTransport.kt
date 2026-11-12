package ru.deabolus.telemostx.core.transport

import ru.deabolus.telemostx.core.model.ChatMessage

/**
 * Future transport boundary. Deliberately no fake implementation is provided.
 */
interface TelemostTransport {
    suspend fun loadMessages(chatId: String): List<ChatMessage>
    suspend fun sendMessage(chatId: String, text: String): ChatMessage
    suspend fun markRead(chatId: String, messageId: String)
}
