package ru.deabolus.telemostx.core.privacy

/**
 * Desired client-side privacy preferences.
 *
 * IMPORTANT: these values are only a design contract. No network layer currently
 * consumes them, so changing them cannot alter server-side presence or receipts.
 */
data class PrivacyPolicy(
    val suppressReadReceipts: Boolean = false,
    val suppressOnlinePresence: Boolean = false,
    val suppressTypingIndicator: Boolean = false,
    val allowManualReadReceipt: Boolean = true
)
