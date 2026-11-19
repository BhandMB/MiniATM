# MiniATM Ledger Reconciliation Invariants

## Objective
Ensure account balances remain consistent with the transaction history.

## Core invariants
- Every posted transaction has one unique reference.
- A debit reduces the account balance by exactly the posted amount.
- A credit increases the account balance by exactly the posted amount.
- Rejected or rolled-back transactions do not affect the balance.
- The opening balance plus posted credits minus posted debits equals the current balance.
- Reversals reference the original transaction and are applied at most once.

## Reconciliation procedure
Calculate expected balances from the ledger, compare them with stored account balances, and report mismatches without automatically overwriting data. Investigate transaction ordering, duplicate references, and incomplete writes.

## Tests
Include multiple transactions, reversals, duplicate submissions, concurrent operations, and simulated persistence failures. Use decimal-safe arithmetic for all monetary values.