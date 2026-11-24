# MiniATM Cash Dispense Failure and Recovery

## Purpose
Define safe transaction behavior when a withdrawal is accepted but cash dispensing fails or its outcome is uncertain.

## Transaction stages
Model authorization, balance reservation or debit, dispense request, dispense confirmation, and finalization as explicit states. Avoid a single boolean success flag for the entire operation.

## Core invariants
- A failed dispense must not permanently reduce the customer's available balance.
- A confirmed dispense must not be refunded automatically.
- An unknown dispense outcome must be reconciled before retrying.
- The same transaction identifier must not cause multiple debits or multiple dispense attempts.

## Recovery rules
If the dispenser reports a definite failure, reverse the debit or release the reservation exactly once. If the response is lost and the physical outcome is unknown, mark the transaction for reconciliation; do not blindly retry. Record device status and operator resolution.

## Test scenarios
1. Dispense succeeds and confirmation is received.
2. Dispense fails before cash is released.
3. Device times out after accepting the command.
4. Duplicate client submission arrives.
5. Reversal is attempted twice.
6. Reconciliation confirms cash was dispensed despite a timeout.

## Audit
Record transaction ID, state transitions, timestamps, device response codes, and reconciliation outcome. Never store PIN values in transaction logs.
