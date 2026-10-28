# MiniATM Transaction History Consistency Checks

**Date:** 2026-10-28  
**Purpose:** Specify how transaction records should agree with account state.

## Consistency rules

- A rejected transaction must not appear as a successful transaction.
- Every successful transaction records the amount, type, and resulting balance if history is supported.
- Transaction amounts follow the same precision and sign policy as the balance logic.
- The displayed balance after a transaction matches the stored in-memory or persisted balance.
- History order is deterministic, with a documented newest-first or oldest-first convention.
- A reset or restart follows the documented persistence policy and does not silently create misleading history.

## Test scenarios

1. Perform a deposit, then a withdrawal, and reconcile the final balance.
2. Attempt an over-balance withdrawal and confirm state and successful history remain unchanged.
3. Enter an invalid amount and verify no transaction is recorded.
4. Test empty history and a history list with multiple records.
5. If persistence exists, restart the application and compare balance and history.

## Acceptance criteria

Tests assert both account state and transaction history. If the app does not yet implement history or persistence, mark those cases as future work rather than claiming support.