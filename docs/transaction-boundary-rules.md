# Transaction Boundary Rules

ATM operations should preserve a small set of invariants even when inputs are invalid or an operation cannot complete.

## Withdrawal
1. Reject zero or negative amounts.
2. Reject amounts greater than the available balance.
3. Reject withdrawals that cannot be represented by the supported cash denominations.
4. Change the balance only after all validation succeeds.

## Deposit
1. Reject invalid or non-positive amounts when the application does not support them.
2. Update the balance exactly once for a successful deposit.

## Failure behavior
- A rejected transaction must leave the account balance unchanged.
- A failed operation should return a clear reason suitable for the caller.
- Repeating a failed request must not partially apply the previous attempt.

## Tests
For each transaction type, cover valid input, boundary input, invalid input, insufficient funds, and state-after-failure. These tests should assert both the returned result and the final balance.
