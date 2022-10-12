import sys
input = sys.stdin.readline

N = int(input())

heights = [int(input()) for i in range(N)]
stck = []
result = 0

for i in range(N):
    while stck and stck[-1] <= heights[i]:
        stck.pop()
        
    stck.append(heights[i])
    result += len(stck) - 1
    
print(result)
