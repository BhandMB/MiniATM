# MiniATM Balance and Transaction Invariants

Date: 2026-11-03

## Core invariants
1. A balance must never become negative unless overdrafts are an explicit feature.
2. A withdrawal greater than the available balance must not mutate the balance.
3. A rejected transaction must not appear as a completed debit.
4. A successful transaction must update the balance and transaction history consistently.
5. Amounts must be positive and within configured limits.
6. Repeating a request must not accidentally apply the same transaction twice if idempotency is supported.

## Test cases
- Deposit at minimum and maximum allowed values
- Zero, negative, malformed, and excessively large amounts
- Withdrawal equal to balance
- Withdrawal one unit above balance
- Multiple sequential transactions
- Failure during transaction persistence

Use a resettable test account and assert both the displayed balance and stored transaction history. These are proposed invariants, not completed test results.