# Transaction Test Cases

- Deposit a positive amount and verify the balance increases by the exact amount.
- Withdraw an amount equal to the balance and verify the balance reaches zero.
- Reject withdrawals larger than the available balance.
- Reject zero and negative amounts.
- Reject malformed numeric input without changing the balance.
- Verify failed transactions do not create misleading history entries.
