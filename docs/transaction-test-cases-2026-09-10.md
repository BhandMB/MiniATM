# Transaction Test Cases — 2026-09-10

| Scenario | Expected result |
|---|---|
| Valid withdrawal within balance | Dispense amount and reduce balance once |
| Withdrawal above balance | Reject without changing balance |
| Non-positive amount | Reject before transaction processing |
| Amount not matching supported denomination | Reject with a clear message |
| Repeated submission | Process at most one transaction per user action |
| Failed transaction | Preserve the original balance |

## Review note
Tests should assert both the returned message and the final account state so a passing response cannot hide an incorrect balance update.
