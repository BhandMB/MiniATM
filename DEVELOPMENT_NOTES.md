# MiniATM Transaction Test Checklist

Use these cases when changing account or transaction logic.

- Accept valid deposits and withdrawals and update the balance correctly.
- Reject zero or negative transaction amounts when the operation requires a positive amount.
- Prevent withdrawals that exceed the available balance.
- Confirm invalid menu choices do not corrupt the current session state.
- Check balance calculations after sequences of deposits and withdrawals.
- Keep transaction messages clear and never expose sensitive account information.
