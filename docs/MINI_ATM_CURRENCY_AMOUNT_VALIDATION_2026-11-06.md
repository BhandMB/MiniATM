# MiniATM Currency Amount Validation

Date: 2026-11-06

## Input rules to define
- Accepted currency precision and rounding behavior
- Minimum and maximum transaction amount
- Whether fractional minor units are rejected or rounded
- Handling of zero, negative, blank, malformed, and overflow values
- Locale-specific decimal and grouping separators

## Safety expectations
Reject invalid values before balance mutation. Use decimal-safe arithmetic or integer minor units. Displayed amounts and persisted amounts must agree.

## Test boundaries
Test one unit below, at, and above each configured limit. Include very large values and repeated submissions. Verify rejected inputs do not create transaction records or change balances.

The precise policy must match the currency and application requirements; do not infer it from UI formatting alone.