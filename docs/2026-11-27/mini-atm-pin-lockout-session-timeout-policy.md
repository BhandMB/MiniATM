# PIN attempt lockout and session timeout policy

## Objectives
Limit PIN guessing, expire abandoned sessions, and avoid leaking whether an account exists.

## Policy decisions
Document maximum consecutive failures, lockout duration, counter reset behavior, escalation after repeated lockouts, idle timeout, absolute session lifetime, and reauthentication for sensitive actions.

## Safeguards
Track failures against the account and apply throttling that cannot be bypassed by restarting the client. Use generic authentication failures. Never log or store PINs in plaintext. Clear sensitive session state on logout and timeout.

## Tests
Attempt-limit boundary, lockout expiry, successful reset, repeated lockout, idle timeout, absolute expiry, and direct actions after expiry. Enforce invalidation server-side where applicable.
