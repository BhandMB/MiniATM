# MiniATM Transaction State Machine

Date: 2026-11-23

## Purpose
Describe valid transaction states and transitions so failures cannot leave ambiguous account effects.

## Suggested states
Initiated, validated, processing, posted, rejected, and reversed. Define which transitions are terminal and which may be retried safely.

## Transition requirements
Each transition should have a transaction reference, timestamp, actor or system component, and reason where applicable. Posting the ledger effect and recording the posted state should be atomic or recoverable through a documented consistency mechanism.

## Failure cases
Consider process termination before posting, after posting but before acknowledgement, duplicate requests, and concurrent operations on the same account.

## Invariants
- A transaction posts at most one effective ledger movement.
- Rejected transactions have no posted debit or credit.
- Reversals link to an existing posted transaction.
- Terminal state transitions cannot be silently rewritten.

## Verification
- [ ] Every transition is enumerated.
- [ ] Illegal transitions are rejected.
- [ ] Duplicate processing is safe.
- [ ] Recovery can reconcile uncertain outcomes.

## Scope
State-machine specification only; no transaction engine was modified.