# Telemost/Xiva network gate

**Status: PARTIALLY UNBLOCKED — official Telemost REST and MCP integrations
exist, but neither establishes a supported native Xiva messaging client.**

The official REST API documents meeting/stream management for Yandex 360 for
Business accounts on an organization domain. Its scopes and limits, plus the
separate read-only chat access available through the preview MCP server, are
summarized in [research.md](./research.md).

These are not a documented Android SDK or Xiva/WebSocket contract. MCP chat
operations are read-only; no supported send-message operation for a standalone
client has been established.

## Run status

There is no test command or source client to run. No mock was substituted for a
real test. No request was sent to Telemost or Xiva, so there is no server
response to save.

Do not supply an internal endpoint, copied application credential, OAuth token,
or Xiva secret to make this experiment run. A test of a documented REST or MCP
operation would require an authorized account and consent. The documented REST
meeting scopes do not cover standalone chat messaging. A chat-client test
additionally requires the provider to document or explicitly authorize all of
the following for the intended messaging operations:

- an OAuth client registration path for this independent application;
- the exact permission scopes covering the intended Telemost operations;
- a documented client SDK or API and its supported connection/message contract;
- an authorized test account/environment.

Once that gate is satisfied, keep credentials outside the repository and save
only redacted request/response evidence.

## Evidence

See [EVIDENCE.md](./EVIDENCE.md) for the blocker, source assessment, and
verification status. The check-by-check record is in [checks.log](./checks.log).
