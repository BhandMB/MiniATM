# MiniATM transaction invariants

Date: 2026-10-25

Test that balance stays non-negative unless overdraft is supported; excessive withdrawals, zero/negative amounts, and non-numeric input are rejected; rejected operations preserve balance; deposits and withdrawals change balance by the accepted amount; decimal precision follows currency rules; invalid menu choices do not crash; and state does not go stale.
