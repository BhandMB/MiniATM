# ATM Boundary Cases — 2026-09-07

- Withdraw exactly the available balance.
- Reject withdrawals greater than the available balance.
- Reject zero and negative withdrawal amounts.
- Deposit zero and negative amounts should be rejected.
- Verify balance remains unchanged after a rejected transaction.
- Verify a successful transaction updates balance exactly once.
- Verify repeated input does not accidentally apply the same transaction twice.