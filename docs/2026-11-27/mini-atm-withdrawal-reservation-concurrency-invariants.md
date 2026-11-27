# Withdrawal reservation and concurrency invariants

## Invariants
- Withdrawal cannot exceed available balance.
- A transaction is applied at most once.
- Ledger balance equals opening balance plus posted credits minus posted debits.
- Failed/cancelled withdrawals leave no posted debit.
- Concurrent withdrawals cannot spend the same available funds.

## Processing
Validate amount and denomination availability, then reserve funds within a transaction or serialized critical section. Record a unique transaction reference and state. Commit debit only when simulated cash dispense succeeds; otherwise release reservation and record failure/reversal.

## Failure cases
Test two simultaneous withdrawals whose combined amount exceeds balance, duplicate submit, dispense failure, timeout after commit, and retry with the same transaction reference.

## Evidence
Capture before/after balances and ledger entries. Enforce invariants at persistence/service layer, not solely through UI balance checks.
