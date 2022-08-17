#dp
#prefix algorithm

import sys
input = sys.stdin.readline

N,M = map(int, input().split())
nums = list(map(int, input().split()))
sum = [0]
number = 0

#합을 미리 저장
for i in nums:
  number += i
  sum.append(number)

for i in range(M):
  a,b = map(int, input().split())
  print(sum[b] - sum[a - 1])
