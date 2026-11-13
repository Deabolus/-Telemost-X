# Network-gate evidence

**Checked:** 2026-11-13 (UTC)
**Result:** Limited official integrations found; no live Telemost/Xiva test
performed. See [research.md](./research.md) for the full source review.

## Question

Can this independent Android client connect to Telemost/Xiva and exchange
messages using an access method documented or explicitly supported by Yandex?

## Findings

### Confirmed

- Yandex publishes a Telemost REST API for conferences, streams, cohosts, and
  organization defaults. It documents five scopes; access is limited to
  Yandex 360 for Business users with accounts on an organization domain.
  - [REST API index](https://yandex.com/dev/telemost/doc/ru/llms.txt)
  - [Access and scopes](https://yandex.com/dev/telemost/doc/ru/access.md)
- Yandex publishes a preview Telemost MCP server for external AI tools. It
  supports listing/searching chats and reading messages, but chat/message
  operations are read-only.
  - [MCP server documentation](https://yandex.ru/dev/yandex-360/mcp/ru/telemost)
  - [MCP security requirements](https://yandex.ru/dev/yandex-360/mcp/ru/security.md)
- The local reverse-engineering notes identify the original app's
  `ProxyPassportActivity`, Passport token handling, an OAuth header provider,
  and an internal `request_user` call that can request an Xiva secret. These
  findings describe original-app internals; they do not establish that the
  flow is supported for a third-party native Xiva client.
  - [Authentication investigation](../../research/notes/auth-investigation.md)
  - [Xiva/auth transport findings](../../research/logs/protocol-stage-55.log)
- The REST API index does not list general chat-history or send-message
  operations; the official MCP documentation limits chat operations to reading.
  No official Telemost Xiva SDK/direct WebSocket contract was found.
  - [Xiva dispatcher](../../research/logs/protocol-stage-57.log)
  - [Socket implementation findings](../../research/logs/protocol-stage-58.log)
  - [Reconnect and frame parsing findings](../../research/logs/protocol-stage-59.log)
  - [Frame-transmission findings](../../research/logs/protocol-stage-60.log)

### Unknown

- Exact OAuth scope identifiers used by the MCP preview consent grant; the
  documentation asks users to review the consent screen but does not enumerate
  those identifiers in its text.
- Whether a separate partner program or private SDK exists.
- Whether Yandex authorizes a standalone client to send chat messages or use
  Xiva directly.

## Exact blocker

The previous broad claim that no official Telemost API exists is superseded:
official REST and MCP integrations are documented. The remaining blocker for
the requested standalone chat client is that the REST API does not document
general chat read/send methods, MCP is a preview external-agent interface with
read-only chat operations, and no supported Xiva SDK/contract has been
identified. Internal Passport/Xiva findings do not fill that gap.

## Test and response record

- Real connection test: **not run**.
- Message send/receive test: **not run**.
- Server requests made: **none**.
- Server responses: **none available**; none were fabricated or replaced with
  mock data.
- Test source: **not created**. No live test was performed in this research
  update; implementing a client against the internal protocol would bypass the
  supported-access gate this experiment is intended to enforce.
- Secrets or tokens saved: **none**.

## Gate to resume

For a standalone chat-send/Xiva test, obtain official documentation or explicit
written authorization identifying the registration procedure, exact scopes for
those operations, a supported API/SDK contract, and an authorized test
environment/account. The already documented meeting scopes do not satisfy this
gate. Reassess before adding a network test. Keep credentials local and redact
all evidence before saving it in the repository.
