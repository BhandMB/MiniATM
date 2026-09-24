# Transaction Safety Review

## Invariants

- A rejected transaction must not change the balance.
- A withdrawal cannot exceed the available balance.
- Amounts must be positive and parseable before processing.
- Deposit and withdrawal results should be reflected consistently in the displayed balance.
- Each completed transaction should produce one clear user-facing result.

## Verification

Exercise valid, zero, negative, malformed, insufficient-balance, and repeated-input cases during regression testing.
