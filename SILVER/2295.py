import sys
input = sys.stdin.readline

N = int(input())
nums = sorted([int(input()) for _ in range(N)])

sum = set()

for i in nums:
    for j in nums:
        sum.add(i+j)

result = 0
cnt = 0

for i in range(N-1, -1, -1): #큰 것부터 접근
        for j in range(i+1):
            if nums[i] - nums[j] in sum:
                result = nums[i]
                cnt += 1
                if cnt == 1:
                    print(result)

