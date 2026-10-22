# MiniATM Balance Invariants

Use these invariants when reviewing balance-changing operations:

- A transaction must not silently change the balance when input validation fails.
- A withdrawal must reject amounts that violate the application's configured rules.
- A deposit must reject invalid or non-positive amounts if required by the domain policy.
- A failed operation should leave the previous balance unchanged.
- Displayed balances should match the stored in-memory or persisted state used by the application.
- Repeated input errors should not crash the application or corrupt the session.

Suggested tests: exact balance amount, zero, negative value, malformed input, amount greater than available balance, and repeated invalid entries. Confirm the intended rules from the source code before asserting outcomes.