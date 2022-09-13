import sys
from collections import deque

input = sys.stdin.readline

N, M = map(int, input().split())
pos = list(map(int, input().split()))

que = []

for i in range(1, N + 1):
    que.append(i)

dque = deque(que)

dis = 0

for i in range(M):
    num = pos[i]
    left_cnt = dque.index(num)
    right_cnt = len(dque) - dque.index(num)

    while num != dque[0]:
        if left_cnt >= right_cnt:
            dque.appendleft(dque.pop())
            dis += 1
        else:
            dque.append(dque.popleft())
            dis += 1

    dque.popleft()

print(dis)
