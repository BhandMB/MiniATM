# Transaction Audit Notes

## Invariants
- Balance must never become negative.
- A successful withdrawal decreases balance exactly once.
- A failed withdrawal leaves balance unchanged.
- Every completed transaction should have a user-visible result.

## Review cases
1. Withdraw an amount below the balance.
2. Withdraw an amount equal to the balance.
3. Withdraw an amount above the balance.
4. Enter zero, a negative value, and non-numeric input.
5. Retry after a failed transaction and confirm no duplicate debit.
