import sys

input = sys.stdin.readline

def binarySearch(arr, m):
    start = 1
    end = max(arr)

    while start <= end:
        total = 0
        mid = (start + end) // 2

        for i in arr:
            total += i // mid

        if total >= m:
            start = mid + 1
        else:
            end = mid - 1

    print(end)


K, N = map(int, input().split())

lans = [int(input()) for _ in range(K)]

binarySearch(lans, N)
