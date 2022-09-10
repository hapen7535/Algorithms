import sys

input = sys.stdin.readline

N, C = map(int, input().split())
nums = list(map(int, input().split()))

freq = {}

for idx, num in enumerate(nums):
    if num in freq:
        freq[num][0] += 1
    else:
        freq[num] = [1, idx, num]

freq = sorted(freq.values(), key=lambda x: (-x[0], x[1]))

result = []
for item in freq:
    result += [item[2]] * item[0]
print(*result)
