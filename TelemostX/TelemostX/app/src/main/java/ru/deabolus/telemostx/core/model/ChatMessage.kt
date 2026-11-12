package ru.deabolus.telemostx.core.model

/**
 * Neutral message model. It is not connected to the Telemost protocol yet.
 */
data class ChatMessage(
    val id: String,
    val chatId: String,
    val senderId: String,
    val text: String,
    val timestampMillis: Long
)
