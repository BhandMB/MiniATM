# State Transition Test Matrix — September 5, 2026

| Scenario | Expected result |
|---|---|
| Valid amount within available balance | Operation succeeds and balance decreases correctly |
| Amount above available balance | Operation is rejected and balance remains unchanged |
| Unsupported amount format | Input validation fails with a clear message |
| Zero or negative amount | Input validation fails without state mutation |
| Balance inquiry | Current balance is shown without changing state |
| Several sequential operations | State remains correct after each step |

Use this matrix to keep core state transitions covered as implementation details evolve.