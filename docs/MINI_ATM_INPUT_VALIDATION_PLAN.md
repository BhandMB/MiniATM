# MiniATM Input Validation Plan

Use synthetic inputs to verify the application's input handling.

- [ ] Valid numeric amount.
- [ ] Empty input.
- [ ] Whitespace-only input.
- [ ] Alphabetic or mixed-character input.
- [ ] Zero and negative values.
- [ ] Very large amount near applicable limits.
- [ ] Withdrawal exceeding the available balance.
- [ ] Repeated invalid entries.
- [ ] Recovery after invalid input without restarting, where designed.

For each case, record expected behavior from the implementation, observed behavior, and whether the balance remained unchanged after rejected transactions.