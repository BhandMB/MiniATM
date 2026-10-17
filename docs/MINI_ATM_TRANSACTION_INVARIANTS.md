# MiniATM Transaction Invariants

Use these invariants when reviewing deposit, withdrawal, balance display, and transaction-history behavior.

- A rejected transaction must not change the balance.
- A withdrawal must not allow the balance to become negative.
- Deposits and withdrawals must validate input before updating state.
- Invalid numeric input must not terminate the application unexpectedly.
- The displayed balance should match the stored balance after every accepted transaction.
- Transaction history, if implemented, should record only accepted transactions and the resulting amount consistently.
- Currency calculations should use a representation suitable for the precision required by the application; avoid floating-point surprises for money.

## Suggested tests
- Deposit a positive amount.
- Reject zero and negative deposits if the rules require positive amounts.
- Withdraw less than, equal to, and greater than the available balance.
- Enter non-numeric input and recover cleanly.
- Verify repeated transactions preserve the expected balance.
- Confirm cancellation or invalid input leaves state unchanged.