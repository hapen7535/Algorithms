import sys
input = sys.stdin.readline

def binary_search(B, target):
    start, end = 0, len(B)-1
    cnt = -1
    while start <= end:
        mid = (start + end) // 2
        if B[mid] < target:
            cnt = mid
            start = mid + 1
        else:
            end = mid - 1
    return cnt
    
    
for _ in range(int(input())):
    N, M = map(int, input().split())
    
    A = sorted(map(int, input().split()))
    B = sorted(map(int, input().split()))
    
    result = 0
    
    for i in A:
        result += (binary_search(B, i) + 1)
        
    print(result)
