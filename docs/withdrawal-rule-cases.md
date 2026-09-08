# Withdrawal Rule Cases

Use these cases to verify withdrawal behavior:

- Reject zero or negative amounts.
- Reject amounts greater than the available balance.
- Preserve the balance after a rejected withdrawal.
- Accept a valid amount when all account rules pass.
- Update the balance exactly once for a successful transaction.
- Keep the result deterministic for repeated inputs.

These cases are suitable for unit tests around validation and transaction state changes.
