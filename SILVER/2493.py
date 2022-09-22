import sys
input = sys.stdin.readline

N = int(input())
tops = list(map(int, input().split()))
stck = []
result = [0]*N

for i in range(N):
    top = tops[i]
    while stck and tops[stck[-1]] < top:
        stck.pop()
    if stck:
        result[i] = stck[-1] + 1
    stck.append(i)
print(' '.join(map(str,result)))   
