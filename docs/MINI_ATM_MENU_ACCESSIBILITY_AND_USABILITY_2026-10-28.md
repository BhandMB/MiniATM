# MiniATM Menu Usability Review

**Date:** 2026-10-28  
**Purpose:** Make the console interaction clear and recoverable for first-time users.

## Review checklist

- [ ] Each menu option has a unique, visible number and concise action label.
- [ ] The menu is reprinted after recoverable errors.
- [ ] Input prompts state the expected type and allowed range.
- [ ] Monetary values use a consistent currency and precision format.
- [ ] Success and failure messages clearly distinguish completed and rejected actions.
- [ ] Exit ends the loop cleanly without requiring forced termination.
- [ ] Unexpected input does not corrupt the current balance or terminate the app unexpectedly.

## Manual scenarios

Run through a normal deposit and withdrawal, an invalid menu choice, malformed amount, over-balance withdrawal, and clean exit. Repeat the flow with an empty starting balance if supported. Record observed behavior rather than assuming checklist completion.