# Transaction Invariants — 2026-09-06

These invariants should hold for every ATM operation:

- A withdrawal never reduces the balance below the allowed minimum.
- A failed transaction leaves the balance unchanged.
- The transaction result is explicit: success, rejected, or invalid input.
- Repeated input does not create duplicate balance changes.
- The displayed balance matches the stored balance after each operation.

## Test design

Cover valid, boundary, and invalid amounts. Include insufficient-funds cases and verify that rejected operations do not mutate account state.