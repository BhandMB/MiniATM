# MiniATM PIN Attempt and Lockout Policy

Date: 2026-11-20

## Objective

Specify a predictable response to repeated invalid PIN attempts.

## Policy decisions

Document the allowed attempt count, lockout duration, reset conditions, and user recovery path. Avoid revealing whether an account identifier exists before authentication. Apply attempt tracking to the account and relevant session context so that restarting the client does not reset the protection.

## Security handling

- Never log the PIN or store it in plaintext.
- Use a secure password-hashing approach appropriate to the application.
- Avoid overly detailed failure messages that help guess credentials.
- Record lockout events without recording secret values.
- Ensure support or administrative unlock actions are authorized and auditable.

## Verification

- [ ] Attempt limit is enforced consistently.
- [ ] Lockout survives client restart.
- [ ] Correct PIN behavior after lockout follows documented policy.
- [ ] PIN values never appear in logs.
- [ ] Unlock actions are attributable.

## Scope

Policy documentation only; no authentication code was changed.