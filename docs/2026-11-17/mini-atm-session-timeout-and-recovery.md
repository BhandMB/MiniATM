# MiniATM Session Timeout and Recovery

## Policy
Define inactivity timeout, absolute session lifetime, and the actions that reset inactivity. Ensure sensitive operations require a valid active session.

## Recovery behavior
After timeout, clear sensitive in-memory state and require authentication again. Do not automatically resume a pending withdrawal or deposit without confirming its outcome.

## Tests
Cover idle timeout, active session near expiry, expired session during input, re-authentication, and uncertain transaction response. Verify that account details and PIN input are not retained in an exposed state.