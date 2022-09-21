import sys
input = sys.stdin.readline

N = int(input())
tops = list(map(int, input().split()))

stck = []
result = []

for i in range(N):
    while stck:
        if stck[-1][1] >= tops[i]:
            result.append(stck[-1][0] + 1)
            break
        else:
            stck.pop()
    if not stck:
        result.append(0)
    stck.append([i, tops[i]])
        
    stck.append(i)
    
print(' '.join(map(str,result)))    
