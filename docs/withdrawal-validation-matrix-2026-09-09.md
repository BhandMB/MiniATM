# Withdrawal Validation Matrix

| Case | Expected result |
|---|---|
| Amount is zero | Reject with a clear validation message |
| Amount is negative | Reject before balance lookup |
| Amount exceeds balance | Reject without changing balance |
| Amount violates denomination rules | Reject and preserve balance |
| Valid amount within balance | Debit exactly once and return success |
| Duplicate submission | Prevent double debit or require an idempotency strategy |

The balance update and transaction result should be treated as one atomic operation.