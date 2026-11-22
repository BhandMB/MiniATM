# MiniATM Transaction Idempotency and Recovery

Date: 2026-11-22

## Objective
Ensure retries after timeouts do not debit or credit an account more than once.

## Transaction identity
Assign each initiated transaction a unique reference. Persist its processing state and final outcome atomically with ledger effects. A repeated request with the same reference should return the known outcome rather than execute a second debit.

## Failure handling
Define behavior for failure before persistence, during processing, and after commit but before the client receives a response. The client should query transaction status when the outcome is uncertain rather than blindly submit a new transaction.

## Verification
- [ ] Repeated reference cannot apply a second ledger effect.
- [ ] Concurrent duplicate requests have one effective outcome.
- [ ] Timeout after commit can be safely reconciled.
- [ ] Failed transaction leaves balance and ledger consistent.
- [ ] Transaction status is queryable by an authorized caller.

## Scope
Recovery design document; no transactions or tests were executed.