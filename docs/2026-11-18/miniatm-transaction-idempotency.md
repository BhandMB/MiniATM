# MiniATM Transaction Idempotency

## Goal
Ensure a repeated submission cannot debit an account more than once.

## Design
Assign each withdrawal or deposit request a unique transaction reference. Persist the reference with the transaction result and enforce uniqueness at the storage layer. A retry with the same reference returns the original outcome rather than applying the balance change again.

## Invariants
- A transaction is applied at most once.
- A failed transaction does not partially change the balance.
- Balance and ledger entry update atomically.
- A reference cannot be reused with a different amount or account.
- Rejected insufficient-funds requests remain auditable without a debit.

## Tests
Simulate double-clicks, client retries after timeouts, duplicate references, concurrent withdrawals, and a failure between validation and persistence. Verify both the balance and transaction history after each case.