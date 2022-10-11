N, K = map(int, input().split())
que = [i for i in range(1, N + 1)]

result = []
cnt = 0

for _ in range(N):
    cnt += K - 1
    if cnt >= len(que):
        cnt = cnt % len(que)
    result.append(str(que.pop(cnt)))

print("<" + ", ".join(result) + ">")
