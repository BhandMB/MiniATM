# MiniATM Ledger Reversal and Reconciliation

Date: 2026-11-20

## Purpose

Define how a mistaken or failed transaction is corrected without erasing the original record.

## Ledger principles

- Treat posted ledger entries as immutable.
- Represent corrections as linked reversal or adjustment entries.
- Preserve transaction reference, original entry reference, actor, timestamp, and reason.
- Ensure a reversal cannot be applied twice.
- Keep balance calculations derived from the authoritative ledger or a verifiable balance snapshot.

## Reconciliation

At defined checkpoints, compare the opening balance plus posted credits and debits with the closing balance. Flag mismatches for investigation rather than silently adjusting totals.

## Test scenarios

- [ ] Reversal restores the expected balance exactly once.
- [ ] Duplicate reversal request is rejected or replay-safe.
- [ ] Original entry remains visible.
- [ ] Failed transactions do not create partial ledger effects.
- [ ] Reconciliation detects an intentionally introduced mismatch.

## Scope

Ledger design guidance; no financial transaction or test execution is claimed.