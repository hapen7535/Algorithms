import sys
input = sys.stdin.readline

N = int(input())
nums = list(map(int, input().split()))
sorted_nums = sorted(set(nums))

ans = {sorted_nums[i] : i for i in range(len(sorted_nums))}

for i in nums:
  print(ans[i], end=' ')
