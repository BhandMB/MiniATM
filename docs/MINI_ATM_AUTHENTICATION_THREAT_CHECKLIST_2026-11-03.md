# MiniATM Authentication Threat Checklist

Date: 2026-11-03

## Threats to review
- Repeated PIN/password guessing
- Credential exposure in logs or source control
- Session reuse after logout
- Access to another account by changing an identifier
- Weak or predictable demo credentials
- Sensitive balance or transaction data shown before authentication

## Recommended controls
- Rate-limit failed authentication attempts.
- Store password/PIN verifiers using an appropriate salted password-hashing scheme.
- Invalidate server-side sessions on logout.
- Derive account ownership from the authenticated session.
- Return generic authentication failures without confirming whether an account exists.
- Keep secrets outside source control.

## Verification
Test lockout or throttling boundaries, logout invalidation, direct-object access, and log redaction. Select controls appropriate to the actual application architecture; this checklist does not assert they are already implemented.