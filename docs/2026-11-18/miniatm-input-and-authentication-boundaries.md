# MiniATM Input and Authentication Boundaries

## Input validation
- Accept only documented account identifiers and transaction amounts.
- Reject zero, negative, malformed, and out-of-range amounts.
- Use decimal-safe monetary arithmetic rather than binary floating-point calculations.
- Enforce limits on input length and retry attempts.

## Authentication
- Do not reveal whether an account identifier exists before authentication.
- Apply bounded retry and lockout or delay policies.
- Keep credentials out of logs and exception messages.
- Clear sensitive input after logout or session timeout.

## Transaction safety
Validate authorization and account state again at the transaction boundary. Record the outcome with a reference ID, but never log PINs or other secrets.

## Test scenarios
Boundary values, malformed input, repeated failed authentication, expired sessions, unauthorized account access, and concurrent balance changes.