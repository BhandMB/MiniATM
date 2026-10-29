# MiniATM Currency Precision Test Plan

**Date:** 2026-10-29  
**Purpose:** Define tests for consistent monetary input, arithmetic, and display.

## Policy decisions to confirm

- Currency and number of decimal places supported.
- Whether input accepts a decimal separator other than a period.
- How excess fractional digits are rejected or rounded.
- Whether values are represented using integer minor units or a decimal type rather than binary floating point.
- How negative, zero, and unusually large amounts are handled.

## Test scenarios

| Input / operation | Expected behavior |
|---|---|
| Amount with no fractional part | Accepted if otherwise valid |
| Amount with permitted fractional digits | Accepted and displayed consistently |
| Amount with excess precision | Rejected or rounded according to an explicit policy |
| Negative or zero transaction | Rejected if transactions must be positive |
| Repeated deposits and withdrawals | Final balance reconciles exactly under the chosen representation |
| Very large amount | Handled within documented bounds without overflow |

## Acceptance criteria

- Monetary arithmetic does not silently accumulate floating-point errors.
- Validation and display use the same precision policy.
- Tests assert exact values and boundary behavior.
- The selected currency policy is documented in the application.