#dp
import sys

input = sys.stdin.readline

N = int(input())
S = []
D = []
for _ in range(N):
    S.append(int(input()))

if N == 1:
    print(S[0])
    exit()

elif N == 2:
    print(max(S[0] + S[1], S[1]))
    exit()

D.append(S[0])
D.append(max(D[0] + S[1], S[1]))
D.append(max(D[0] + S[2], S[1] + S[2]))

for i in range(3, N):
    D.append(max(D[i - 3] + S[i - 1] + S[i] , D[i - 2] + S[i]))

print(D[-1])
