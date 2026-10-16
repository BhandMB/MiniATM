# MiniATM Input Validation Cases

Verify that invalid input is rejected safely and does not change account state.

| Input scenario | Expected behavior |
|---|---|
| Non-numeric menu input | Show a helpful message and allow recovery |
| Unknown menu option | Reject the option without terminating unexpectedly |
| Zero withdrawal | Reject the transaction |
| Negative withdrawal | Reject the transaction |
| Withdrawal above balance | Reject and preserve the balance |
| Zero or negative deposit | Reject the transaction |
| Very large amount | Handle according to documented limits without overflow |
| Empty input | Recover cleanly and prompt again |

## Test notes
- Capture the starting balance before each rejected transaction.
- Assert that rejected transactions leave the balance unchanged.
- Test valid operations after invalid input to confirm the session remains usable.
- Keep console messages clear and consistent with the current interface.