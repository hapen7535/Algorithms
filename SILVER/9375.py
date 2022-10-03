import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    clothes = {}

    for _ in range(N):
        cloth, kind = input().split()

        if kind in clothes:
            clothes[kind] += 1
        else:
            clothes[kind] = 1

    count = 1
    for i in clothes:
        count *= (clothes[i] + 1)  # 경우의 수 구하기

    count -= 1
    print(count)  # 알몸 제외
