import sys
input = sys.stdin.readline

N = input().strip()

nums = [0] * 10

for i in str(N):
    if i == '6' or i == '9':
        if nums[6] == nums[9]:
            nums[6] += 1
        else:
            nums[9] += 1
    else:
        nums[int(i)] += 1
        
print(max(nums))
