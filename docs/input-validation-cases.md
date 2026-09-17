# MiniATM Input Validation Cases

Use these cases to keep transaction handling predictable and safe.

| Input | Expected behavior |
|---|---|
| Negative withdrawal amount | Reject with a clear validation message |
| Zero withdrawal amount | Reject without changing the balance |
| Withdrawal greater than balance | Reject and keep balance unchanged |
| Deposit of zero | Reject without creating a transaction |
| Negative deposit amount | Reject with a clear validation message |
| Non-numeric menu input | Re-prompt without terminating the session |
| Multiple valid transactions | Apply each transaction exactly once |
| Balance after rejected transaction | Remains unchanged |

## Review notes

Keep validation close to the transaction boundary so callers cannot bypass it by using a different UI path. Every rejected operation should be observable in tests without depending on console output formatting.
