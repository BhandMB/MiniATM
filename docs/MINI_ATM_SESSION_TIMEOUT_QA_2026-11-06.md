# MiniATM Session Timeout QA Plan

Date: 2026-11-06

## Expected behavior
- An authenticated session expires after the configured inactivity period.
- Expired sessions cannot access balance or transaction history.
- Logout invalidates the session immediately.
- A new login creates a fresh authenticated session.
- Sensitive screens do not remain accessible through browser back navigation after logout.

## Test sequence
1. Authenticate and access an account page.
2. Wait beyond the configured idle timeout.
3. Attempt a protected action and verify re-authentication is required.
4. Log out and replay a previously protected request.
5. Repeat with multiple browser tabs if supported.

Record configured timeout, environment, request result, and observed UI behavior. This plan does not assert that timeout controls are currently configured.