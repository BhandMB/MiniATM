# MiniATM Input Validation and Recovery

**Date:** 2026-10-27  
**Purpose:** Specify how the console menu should recover from invalid input.

## Input classes

1. Menu selection: accept only options currently shown to the user.
2. Monetary amount: parse a numeric value, reject non-positive amounts, and apply the chosen precision policy.
3. Confirmation: accept only documented values (for example, yes/no) and explain invalid choices.
4. End-of-input: exit cleanly rather than looping forever if the input stream closes.

## Recovery behavior

- Display a concise message that identifies the expected input.
- Clear or consume invalid tokens before asking again.
- Preserve the current balance and transaction state after parsing errors.
- Do not print a success message until the transaction has actually completed.
- Keep the menu usable after recoverable input errors.

## Manual test checklist

- [ ] Enter a letter at the numeric menu prompt.
- [ ] Enter an unsupported menu number.
- [ ] Enter a decimal amount and verify the precision policy.
- [ ] Enter zero and a negative amount.
- [ ] Submit blank input if the interface permits it.
- [ ] Send end-of-input and verify graceful termination.
- [ ] Confirm invalid attempts do not create transaction records.