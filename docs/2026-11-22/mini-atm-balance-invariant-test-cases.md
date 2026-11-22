# MiniATM Balance Invariant Test Cases

Date: 2026-11-22

## Invariant
For a ledger-based account, the closing balance must equal the opening balance plus posted credits minus posted debits, subject to explicitly documented holds or adjustments.

## Cases
- Deposit increases the balance by the posted amount.
- Withdrawal decreases the balance only when permitted funds are sufficient.
- Rejected withdrawal creates no debit entry.
- Reversal creates a linked compensating entry.
- Repeated transaction reference does not change the balance twice.
- Concurrent withdrawals cannot overdraw the account.
- Decimal precision and rounding follow one documented currency rule.

## Test design
Use boundary values, concurrent requests, and injected failures around persistence boundaries. Assert both the displayed balance and the underlying ledger entries.

## Checklist
- [ ] Each operation preserves the invariant.
- [ ] Rejected operations have no partial side effects.
- [ ] Reversal is traceable and repeat-safe.
- [ ] Concurrency behavior is deterministic.
- [ ] Currency precision is consistent.

## Scope
Test case specification only; no financial behavior was executed.