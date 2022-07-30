import sys

input = sys.stdin.readline


def binarySearch(slist, m):
    start = 0
    end = max(slist)

    result = 0

    while start <= end:
        total = 0
        mid = (start + end) // 2

        if mid == 0:
            break

        for i in slist:
            if i >= mid:
                total += (i // mid)

        if total >= m:
            start = mid + 1
            result = mid
        else:
            end = mid - 1

    print(result)


M, N = map(int, input().split())

snacks = sorted(map(int, input().split()))

binarySearch(snacks, M)
