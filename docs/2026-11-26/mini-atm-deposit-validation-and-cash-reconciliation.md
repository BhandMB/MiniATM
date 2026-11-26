# MiniATM Deposit Validation and Cash Reconciliation

## Objective
Define reliable handling of cash deposits and reconciliation between accepted notes and account credit.

## Validation sequence
1. Start a uniquely identified deposit session.
2. Validate supported denominations and note-count limits.
3. Record the cash acceptor's confirmed note events.
4. Calculate the accepted amount from confirmed notes only.
5. Credit the account once after the device reports a final accepted state.
6. Reconcile device totals with the ledger.

## Failure handling
If the device outcome is uncertain, keep the deposit pending reconciliation. Do not credit based only on a client-side timeout or user-entered amount. Duplicate completion events must not create duplicate credits.

## Test scenarios
- Unsupported denomination.
- Note rejected by the device.
- Partial deposit followed by cancel.
- Device timeout after accepting notes.
- Duplicate completion notification.
- Ledger write failure after device confirmation.
- Reconciliation finds a mismatch.

## Audit
Record session ID, device reference, denomination counts, accepted total, state transitions, and reconciliation outcome. Never log PINs or unrelated credentials.
