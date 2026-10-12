# MiniATM Transaction Test Plan

Use this checklist to verify transaction behavior against the rules implemented by the application.

## Balance and withdrawal
- [ ] A valid withdrawal decreases the balance by exactly the requested amount.
- [ ] A withdrawal greater than the available balance is rejected without changing the balance.
- [ ] Zero and negative withdrawal amounts are rejected.
- [ ] Invalid numeric input does not crash the session.
- [ ] Repeated transactions use the latest balance, not a stale value.

## Deposit
- [ ] A valid positive deposit increases the balance correctly.
- [ ] Zero and negative deposits are rejected.
- [ ] Invalid input leaves the balance unchanged.

## Session and user flow
- [ ] Invalid menu choices show a useful message.
- [ ] The user can return to the menu after a rejected transaction.
- [ ] Exit terminates the flow cleanly.
- [ ] Sensitive values are not unnecessarily printed or logged.

## Test approach
For each rejected operation, assert both the error behavior and that the balance remains unchanged. Keep expected outputs aligned with the current console/UI wording.