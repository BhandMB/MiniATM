# MiniATM Reversal and Ledger Reconciliation Test Plan

## Purpose
Verify that reversals correct failed or duplicated transactions without erasing the original financial history.

## Ledger principles
Represent a reversal as a linked compensating entry. Preserve the original transaction and its status history. Enforce a unique reversal reference so the same transaction cannot be reversed twice.

## Test scenarios
1. Reverse a confirmed debit after a definite dispense failure.
2. Attempt a second reversal for the same transaction.
3. Reverse a transaction that was never committed.
4. Reconcile a timeout where cash was actually dispensed.
5. Fail the reversal write midway through processing.
6. Verify account balance and transaction history after reversal.
7. Attempt reversal without the required operator permission.

## Reconciliation checks
Compare account ledger totals, transaction state, and device evidence. Route ambiguous physical outcomes to manual reconciliation rather than assuming success or failure.

## Security and audit
Record the original transaction reference, reversal reference, actor, reason, timestamp, and outcome. Do not permit direct balance edits as a substitute for a ledger correction.
