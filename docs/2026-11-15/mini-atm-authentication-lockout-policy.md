# MiniATM Authentication Lockout Policy

## Policy decisions
Document the maximum consecutive failed attempts, lockout duration, reset conditions, and support recovery process.

## Security requirements
- Do not reveal whether an account identifier exists during authentication.
- Apply rate limits consistently across repeated attempts.
- Record security events without storing PINs or authentication secrets.
- Ensure successful authentication resets counters according to policy.

## Tests
Cover threshold boundaries, repeated attempts, lockout expiry, successful recovery, and concurrent attempts. The behavior should be predictable and should not permanently lock a user out after a transient failure.