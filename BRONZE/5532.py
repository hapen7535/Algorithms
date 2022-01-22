L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

W_K = A // C
if A % C > 0:
    W_K = W_K + 1
W_M = B // D
if B % D > 0:
    W_M = W_M + 1

print(L - max(W_K, W_M))
