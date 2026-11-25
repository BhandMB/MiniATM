# MiniATM Concurrent Withdrawal Reservation Test Plan

## Objective
Prevent two simultaneous withdrawals from spending the same available balance or cassette inventory.

## Expected contract
A withdrawal must reserve the required account funds and cash inventory using a concurrency-safe operation. The reservation is either finalized after confirmed dispense or released after a definite failure.

## Scenarios
1. Two withdrawals individually fit the balance but exceed it together.
2. Two withdrawals compete for the last available notes.
3. One request times out while the other succeeds.
4. A duplicate transaction ID is submitted concurrently.
5. A dispense failure releases the reservation exactly once.
6. Process restart occurs while a reservation is pending.

## Implementation considerations
Use database transactions, row-level locking, optimistic version checks, or another proven concurrency strategy. Ensure the account balance and cash inventory cannot become inconsistent. Define reservation expiry and reconciliation for abandoned operations.

## Assertions
- No negative available balance.
- No duplicate debit for one transaction ID.
- No over-allocation of cassette notes.
- Every reservation reaches a documented terminal or reconciliation state.
- Audit history identifies each state transition.

## Test execution
Use integration tests with synchronized concurrent requests, not only sequential unit tests. Repeat under the actual database engine used by the application.
