# MiniATM Audit Event Integrity and Redaction

## Scope
Define safe audit events for authentication, balance inquiry, withdrawal, deposit, reversal, and administrative cash operations.

## Event fields
Capture transaction reference, event type, timestamp, result, and a non-sensitive actor or session reference. Include state transition details required for reconciliation.

## Never record
- PIN values or PIN hashes
- Passwords or authentication secrets
- Full card or account credentials
- Session tokens
- Unnecessary personal information

## Integrity controls
Restrict modification and deletion of audit events. Use append-only event handling where feasible. Protect logs and backups with access controls and retention policies.

## Redaction
Sanitize user-controlled fields and device messages before logging. Ensure exception traces do not include secrets or raw credential payloads.

## Verification
Search test logs for known dummy secrets, verify denied audit access, check event ordering for one transaction, and confirm reversal events reference the original transaction without erasing it.
