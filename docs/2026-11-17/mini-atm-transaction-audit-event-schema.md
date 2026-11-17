# MiniATM Transaction Audit Event Schema

## Event fields
Define a stable transaction identifier, account reference, event type, amount and currency, timestamp, outcome, and safe failure category.

## Integrity
Audit events must be linked to the corresponding transaction outcome. Do not record PINs, authentication secrets, or unnecessary account details. Define retention and access controls.

## Verification
Check successful deposit and withdrawal, rejected insufficient-funds transaction, duplicate request, and reversal. Ensure event ordering and transaction identifiers support reconciliation.