import sys
input = sys.stdin.readline

a_num, b_num = map(int, input().split())
a = set(map(int, input().split()))
b = set(map(int, input().split()))

ans = a - b

if ans:
    print(len(ans))
    print(*sorted(ans))
else:
    print(0)
