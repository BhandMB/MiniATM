# MiniATM Input Validation Boundaries
Date: 2026-10-30

Validate menu choices (blank, text, out-of-range, valid), transaction amounts (blank, whitespace, signs, precision, very large values, non-numeric), and PIN/account identifiers if present.

Invalid input should return the user to a safe prompt without terminating the program or reusing stale transaction values. Do not echo PIN values. If PIN authentication exists, apply bounded retry behavior.

Regression cases: repeated invalid entries, cancellation, exit from nested menus, and a fresh session after logout.

Checklist only; confirm behavior by running the application.