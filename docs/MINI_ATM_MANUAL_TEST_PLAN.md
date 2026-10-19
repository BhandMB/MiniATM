# MiniATM Manual Test Plan

Run these scenarios against the current program and record the observed result.

## Account and menu flow
- [ ] The application starts and displays the expected menu.
- [ ] Each supported menu option routes to the correct operation.
- [ ] Unknown menu choices are handled without crashing.
- [ ] Exit terminates the program cleanly.

## Transactions
- [ ] A valid deposit updates the balance correctly.
- [ ] A valid withdrawal updates the balance correctly.
- [ ] A withdrawal exceeding the balance is rejected.
- [ ] Zero, negative, and malformed amounts are handled according to documented rules.
- [ ] Rejected transactions leave the balance unchanged.

## Repeated use
- [ ] Multiple accepted transactions preserve the correct running balance.
- [ ] Invalid input does not leave the input stream unusable.
- [ ] The displayed balance remains consistent after each operation.