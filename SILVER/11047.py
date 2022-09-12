import sys

input = sys.stdin.readline

N, K = map(int, input().split())
coin = []

for _ in range(N):
    coin.append(int(input()))

coin.sort(reverse=True)  # 큰 순대로 정렬

result = 0
for i in coin:
    if K >= i:
        result += K // i
        K %= i
        if K <= 0:
            break

print(result)
