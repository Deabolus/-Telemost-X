package ru.deabolus.telemostx.core.session

/**
 * Future boundary for account/session handling.
 * Implementation requires a verified, documented or reverse-engineered protocol.
 */
interface SessionRepository {
    suspend fun hasActiveSession(): Boolean
}
