# MiniATM Session Timeout and Recovery

## Policy
Define an inactivity timeout, maximum session duration, and behavior for pending transactions. The timeout should be enforced by the trusted application layer rather than only by a client-side countdown.

## On timeout
- Invalidate the authenticated session.
- Clear sensitive input and transient authentication state.
- Do not leave a partially completed transaction in an ambiguous state.
- Show a neutral message and require authentication before further account access.
- Preserve a transaction reference so a user can safely check the outcome of a request that timed out during submission.

## Recovery
A retry must not repeat a completed debit or credit. Use transaction idempotency and a status lookup where supported.

## Tests
Cover idle expiry, expiry during a transaction, browser or process restart, repeated sign-in failures, and a response lost after a transaction was committed.