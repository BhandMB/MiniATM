# Withdrawal Safety Cases

- Reject zero and negative withdrawal amounts.
- Reject non-numeric input without changing the balance.
- Reject withdrawals greater than the available balance.
- Apply a successful withdrawal exactly once.
- Keep the balance unchanged when validation fails.
- Preserve a clear transaction result for the caller.
