# MiniATM Transaction Invariants

Every deposit, withdrawal, and balance inquiry should preserve these invariants:

1. A transaction amount must be numeric and greater than zero.
2. A withdrawal must never reduce the balance below zero.
3. A rejected transaction must leave the balance unchanged.
4. The displayed balance after a successful transaction must equal the previous balance plus the signed transaction amount.
5. Repeating a menu action must not apply the same transaction twice.
6. The transaction result should be shown only after the balance update succeeds.

## Suggested verification cases

| Case | Expected result |
| --- | --- |
| Deposit zero | Reject; balance unchanged |
| Withdrawal negative amount | Reject; balance unchanged |
| Withdrawal greater than balance | Reject; balance unchanged |
| Valid deposit | Increase balance by exact amount |
| Valid withdrawal | Decrease balance by exact amount |
| Invalid text input | Show validation message and return to a safe input state |

These rules provide a compact oracle for unit tests and manual verification.