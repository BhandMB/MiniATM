# MiniATM Session Reset and Exit Test Plan

**Date:** 2026-10-29  
**Purpose:** Verify predictable behavior when users exit, restart, or begin a fresh session.

## Scenarios

- Selecting exit ends the main menu loop cleanly.
- Invalid menu input does not accidentally trigger exit or a transaction.
- A new session initializes state according to the documented persistence policy.
- If balance is persisted, restart restores it from the intended source.
- If balance is intentionally in-memory only, restart behavior is communicated clearly.
- Pending input or malformed input cannot trap the application in an infinite loop.
- Repeated exit selection does not trigger duplicate cleanup or error output.

## Manual verification record

For each scenario, record the exact input sequence, expected result, observed result, and environment. Distinguish a designed session reset from deletion of persistent data. Do not describe persistence as implemented unless the code and tests confirm it.