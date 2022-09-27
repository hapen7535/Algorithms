import sys
input = sys.stdin.readline

n = int(input())
nums = sorted(map(int, input().split()))
x = int(input())

count = 0
start, end = 0, n-1

#이분탐색
while start < end:
    tmp = nums[start] + nums[end]
    if tmp == x:
        count += 1
        start += 1
    elif tmp < x:
        start += 1
    else:
        end -= 1
        
print(count)
