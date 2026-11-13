# Telemost/Xiva network gate

**Status: BLOCKED — no supported Telemost chat/Xiva authorization contract has
been established.**

This experiment is intentionally not an executable client. The repository
contains reverse-engineered references to internal Passport and Xiva code, but
no confirmed developer registration, Telemost OAuth scope, or documented
Telemost chat/Xiva API. The public Yandex ID OAuth documentation covers access
to Yandex ID user data; it does not establish access to Telemost messaging.

## Run status

There is no test command or source client to run. No mock was substituted for a
real test. No request was sent to Telemost or Xiva, so there is no server
response to save.

Do not supply an internal endpoint, copied application credential, OAuth token,
or Xiva secret to make this experiment run. Add a real test only after the
provider documents or explicitly authorizes all of the following:

- an OAuth client registration path for this independent application;
- the exact permission scopes covering the intended Telemost operations;
- a documented client SDK or API and its supported connection/message contract;
- an authorized test account/environment.

Once that gate is satisfied, keep credentials outside the repository and save
only redacted request/response evidence.

## Evidence

See [EVIDENCE.md](./EVIDENCE.md) for the blocker, source assessment, and
verification status. The check-by-check record is in [checks.log](./checks.log).
