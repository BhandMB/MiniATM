# MiniATM Transaction Atomicity Test Plan
Date: 2026-10-30

Verify each deposit or withdrawal either completes fully or leaves account state unchanged.

Cases: valid deposit; reject zero, negative, malformed, or excessive amounts; valid withdrawal; reject insufficient funds; simulate failure between balance update and history recording; confirm rejected operations do not create successful history entries.

Invariants: balance never becomes negative; each successful transaction has exactly one matching history entry; rejected operations do not change balance.

Use integer minor units or decimal-safe arithmetic for currency. This is a test plan; execution results must be recorded separately.