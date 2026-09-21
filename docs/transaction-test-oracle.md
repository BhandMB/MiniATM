# Transaction Test Oracle

Use the following invariants when validating ATM transaction behavior.

- A successful deposit increases balance by exactly the deposited amount.
- A successful withdrawal decreases balance by exactly the withdrawn amount.
- A rejected transaction does not change the balance.
- Negative, zero, malformed, or over-limit amounts are rejected consistently.
- The displayed balance after a transaction matches the persisted balance.
- Repeating the same rejected request does not create a partial side effect.

For each case, record the input, expected result, actual result, and balance before and after.
