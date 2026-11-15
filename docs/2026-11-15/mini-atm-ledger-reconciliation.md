# MiniATM Ledger Reconciliation

For each completed transaction, the account balance change must reconcile with the ledger entry and transaction amount.

## Checks
- Opening balance plus credits minus debits equals closing balance.
- Rejected withdrawals do not create debit ledger entries.
- Repeated transaction identifiers do not create duplicate entries.
- Reversals reference the original transaction and are auditable.

## Test scenarios
Reconcile a normal withdrawal, deposit, insufficient-funds attempt, duplicate request, and reversal. Include zero and boundary amounts. A reconciliation report identifies mismatches without modifying the ledger automatically.