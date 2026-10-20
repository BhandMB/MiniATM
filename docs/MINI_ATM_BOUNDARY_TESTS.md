# MiniATM Boundary Test Cases

Use these cases to check input limits and balance invariants. Align expected results with the rules implemented by the program.

| Scenario | Expected property |
|---|---|
| Deposit a valid positive amount | Balance increases by the accepted amount |
| Deposit zero or a negative amount | Rejected if deposits must be positive; balance unchanged |
| Withdraw less than the balance | Balance decreases correctly |
| Withdraw the exact balance | Follows the documented zero-balance rule |
| Withdraw more than the balance | Rejected; balance unchanged |
| Enter non-numeric input | Handled without an unexpected crash |
| Enter a very large amount | Rejected or handled within documented numeric limits |
| Repeat an invalid transaction | Balance remains unchanged after every rejection |

## Additional checks
- [ ] Confirm rounding and currency precision are consistent.
- [ ] Verify menu navigation remains usable after invalid input.
- [ ] Confirm displayed balance matches the stored value.