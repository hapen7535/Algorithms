#dp

import sys
input = sys.stdin.readline

N = int(input())
D = []
D.append(0)
D.append(0)

for i in range(2, N+1):
  D.append(D[i-1]+1)
  if i % 2 == 0:
    D[i] = min(D[i], D[i//2]+1)
  if i % 3 == 0:
    D[i] = min(D[i], D[i//3]+1)

print(D[N])

