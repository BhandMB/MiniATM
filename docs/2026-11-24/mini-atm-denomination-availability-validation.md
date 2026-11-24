# MiniATM Denomination Availability Validation

## Objective
Prevent withdrawals that cannot be satisfied by the cash currently available in the machine.

## Validation sequence
1. Validate amount is positive and within configured transaction limits.
2. Validate amount is compatible with supported denominations.
3. Read a consistent snapshot of cassette counts.
4. Determine whether a valid denomination combination exists.
5. Reserve the required notes before dispensing.
6. Update cassette counts only from confirmed dispenser outcomes.

## Important edge cases
- Requested amount is below the smallest denomination.
- Amount is not divisible by any supported denomination combination.
- Total cash value is sufficient but the required denomination mix is unavailable.
- A cassette becomes unavailable between validation and reservation.
- A partial dispense occurs.
- Two withdrawals compete for the same notes.

## Algorithm checks
Test greedy selection only if the denomination system guarantees it is optimal. Otherwise use a bounded combination algorithm and enforce note-count limits. Keep the algorithm deterministic for identical inventory and amount inputs.

## Reconciliation
Compare logical cassette counts with physical device counts. Flag discrepancies rather than silently adjusting balances.

## Acceptance criteria
The ATM rejects impossible withdrawals before debiting the account and preserves accurate inventory after success, failure, and partial dispense.
