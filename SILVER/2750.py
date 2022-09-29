import sys
input = sys.stdin.readline

N = int(input())
nums = []

for _ in range(N):
    nums.append(int(input().rstrip()))

for i in sorted(nums):
    print(i)
