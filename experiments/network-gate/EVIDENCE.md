# Network-gate evidence

**Checked:** 2026-11-13 (UTC)
**Result:** BLOCKED before authentication; no live Telemost/Xiva test performed.

## Question

Can this independent Android client connect to Telemost/Xiva and exchange
messages using an access method documented or explicitly supported by Yandex?

## Findings

### Confirmed

- Yandex documents OAuth 2.0 and the Yandex ID mobile SDK for apps requesting
  access to Yandex ID data. OAuth apps must be registered; requested permissions
  are selected from the relevant service's documented permissions. The listed
  Yandex ID user data includes identity/profile fields, not Telemost chats or
  Xiva access.
  - [Yandex ID overview](https://yandex.com/dev/id/doc/en/index.md)
  - [Registering an app](https://yandex.com/dev/id/doc/en/register-client.md)
  - [App registration for API access](https://yandex.com/dev/id/doc/en/register-api.md)
  - [Getting an OAuth token](https://yandex.com/dev/id/doc/en/access.md)
- The local reverse-engineering notes identify the original app's
  `ProxyPassportActivity`, Passport token handling, an OAuth header provider,
  and an internal `request_user` call that can request an Xiva secret. These
  findings describe original-app internals; they do not establish that the
  flow is supported for a third-party app or that the resulting OAuth token
  authorizes Telemost/Xiva.
  - [Authentication investigation](../../research/notes/auth-investigation.md)
  - [Xiva/auth transport findings](../../research/logs/protocol-stage-55.log)
- The local protocol logs describe internal Xiva/WebSocket behavior, but the
  repository contains no supported public client contract or verified
  Telemost OAuth scope.
  - [Xiva dispatcher](../../research/logs/protocol-stage-57.log)
  - [Socket implementation findings](../../research/logs/protocol-stage-58.log)
  - [Reconnect and frame parsing findings](../../research/logs/protocol-stage-59.log)
  - [Frame-transmission findings](../../research/logs/protocol-stage-60.log)

### Hypothesis

An OAuth token issued for Yandex ID profile permissions alone would not grant
Telemost chat/Xiva access. This follows from the documented scope model and
the absence of a Telemost permission/API contract in the evidence reviewed;
it has **not** been tested against a server.

### Unknown

- Whether Yandex offers a separate partner, enterprise, or otherwise
  restricted Telemost integration that is not covered by the documentation
  reviewed here.
- Whether a third-party OAuth client can request any Telemost-specific scope.
- The supported API/SDK, endpoint, and message contract, if one is available.
- Whether Xiva access is permitted to independent clients at all.

The public documentation review is not proof that no private or separately
documented integration exists.

## Exact blocker

No Yandex-approved OAuth client, Telemost-specific scope, or supported
Telemost/Xiva API/SDK contract has been identified or provided for this
experiment. The discovered Passport and `request_user`/Xiva-secret flow is
internal app evidence, not proof of authorization for this client. Without
those prerequisites, attempting the internal connection would not qualify as
a supported-access test.

## Test and response record

- Real connection test: **not run**.
- Message send/receive test: **not run**.
- Server requests made: **none**.
- Server responses: **none available**; none were fabricated or replaced with
  mock data.
- Test source: **not created**. Implementing a client against the internal,
  undocumented protocol would bypass the supported-access gate this experiment
  is intended to enforce.
- Secrets or tokens saved: **none**.

## Gate to resume

Obtain official documentation or explicit written authorization identifying
the client registration procedure, exact Telemost scopes, supported API/SDK,
and an authorized test environment/account. Reassess this gate before adding a
network test. Keep any credentials local and redact all evidence before saving
it in the repository.
