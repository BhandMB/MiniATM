# Session Timeout Rules

An ATM session should have a clear lifecycle and should not remain active indefinitely.

## Expected behavior
- Start a session only after successful authentication.
- Reset the inactivity timer after an approved user action.
- On timeout, clear sensitive session state and return to the authentication screen.
- Do not reveal account details after the session is closed.

## Verification
Test timeout after inactivity, logout before timeout, failed authentication, repeated logout, and navigation attempts after session expiry.