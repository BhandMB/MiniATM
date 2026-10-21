# MiniATM Input Recovery Scenarios

Use these scenarios to check that the program remains usable after invalid input.

- [ ] Enter letters where a numeric menu choice is expected.
- [ ] Enter a blank line and confirm the program responds predictably.
- [ ] Enter a decimal amount where the program expects an integer, or vice versa.
- [ ] Enter a negative or zero transaction amount.
- [ ] Enter a value outside the supported numeric range.
- [ ] After invalid input, provide valid input and confirm the next operation works.
- [ ] Confirm the balance remains unchanged when a transaction is rejected.
- [ ] Confirm the user can still return to the menu or exit cleanly.

Document the actual expected behavior for the program's chosen input strategy and numeric rules.