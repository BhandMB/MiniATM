# MiniATM Balance Invariant Test Plan

**Date:** 2026-10-27  
**Purpose:** Define checks that protect account balance integrity across menu operations.

## Invariants

- A rejected withdrawal must not change the balance.
- A withdrawal larger than the available balance must be rejected.
- A deposit must be positive and within any configured input limits.
- Invalid menu input must not accidentally trigger a transaction.
- A displayed balance must match the value used by the next transaction.
- If transaction history exists, each successful transaction should have one consistent amount and resulting balance.

## Test scenarios

| Starting balance | Action | Expected outcome |
|---:|---|---|
| 100 | Withdraw 30 | Success; balance 70 |
| 100 | Withdraw 100 | Success or rejection according to documented zero-balance policy |
| 100 | Withdraw 101 | Rejected; balance remains 100 |
| 100 | Deposit 25 | Success; balance 125 |
| 100 | Deposit 0 or negative amount | Rejected; balance remains 100 |
| 100 | Enter non-numeric amount | Recover to a valid prompt without terminating unexpectedly |

## Implementation guidance

Keep input parsing separate from transaction rules. Prefer a transaction method that validates the amount before updating the balance, then returns a clear result. Tests should assert both the result and the final balance. Replace this document's example assumptions with the actual product policy where they differ.