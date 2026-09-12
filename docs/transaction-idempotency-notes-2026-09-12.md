# Transaction Idempotency Notes

- A repeated withdrawal request must not debit the balance twice.
- Each transaction should have a unique reference.
- A retried request should return the original result when the reference matches.
- Balance updates and transaction records should succeed or fail together.
- Tests should cover timeout, retry, and duplicate-reference scenarios.
