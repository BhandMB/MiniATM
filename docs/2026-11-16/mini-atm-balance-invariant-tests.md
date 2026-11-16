# MiniATM Balance Invariant Tests

## Invariants
- A balance must never become negative unless overdraft is an explicit supported feature.
- A rejected transaction must not alter the balance.
- Each completed transaction must have exactly one corresponding ledger effect.
- A reversal must preserve a traceable link to the original transaction.

## Scenarios
Test exact-balance withdrawal, one-unit-over-balance withdrawal, zero amount, maximum supported amount, repeated requests, and concurrent withdrawals. Verify persisted state after each scenario.