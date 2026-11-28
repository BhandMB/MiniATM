# Ledger reversal immutability and audit

## Principle
Posted financial ledger entries are immutable. Correcting an erroneous posting requires a linked compensating entry rather than editing or deleting history.

## Reversal contract
A reversal references the original transaction, records amount and reason, identifies the actor/system process, and is permitted only once unless partial reversals are explicitly modeled. Validate that the reversal cannot exceed the unreversed amount.

## Consistency
Update transaction state, balance projection, and audit evidence atomically where possible. Reconcile the derived balance against the ledger. Define recovery behavior if an external dispense action and local persistence disagree.

## Tests
Duplicate reversal, partial reversal boundary, reversal of a pending transaction, unauthorized reversal, concurrent reversal attempts, and reconciliation after simulated interruption. Preserve a complete chain from original transaction to correction.
