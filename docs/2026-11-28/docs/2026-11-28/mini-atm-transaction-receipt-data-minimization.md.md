# Transaction receipt data minimization

## Objective
Receipts should provide useful transaction evidence without exposing unnecessary account or authentication information.

## Allowed content review
Document which fields are required: transaction reference, date/time, transaction type, amount, outcome, and a safely masked account reference where justified. Never print PINs, credentials, full account identifiers, or internal diagnostic data.

## Generation rules
Generate receipts from the committed transaction record, not from untrusted client display values. Distinguish pending, completed, failed, and reversed outcomes. Use a stable transaction reference and consistent currency formatting.

## Verification
Inspect printed/downloaded and on-screen receipts. Test failed and reversed transactions, account masking, locale formatting, and repeated receipt requests. Ensure receipt retrieval is authorized and does not expose another user's transaction.
