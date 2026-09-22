# Transaction Recovery Scenarios — 2026-09-22

| Scenario | Required behavior |
|---|---|
| Invalid amount | Reject without changing balance |
| Insufficient funds | Reject without changing balance |
| Interrupted withdrawal | Never debit twice; surface a recoverable result |
| Repeated submit | Process at most one transaction per user action |
| Balance persistence failure | Fail safely and make the inconsistency visible |

## Test oracle
For every accepted transaction, `ending balance = starting balance + deposits - withdrawals`, and no rejected transaction may alter the balance.