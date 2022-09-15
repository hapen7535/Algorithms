import sys
from collections import deque

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    p = input()
    n = int(input())
    deq = deque(input().rstrip()[1:-1].split(","))  # 숫자만 들어오게

    if n == 0:
        deq = []

    flag = True
    reversed = 0

    for i in p:
        if i == 'R':
            reversed += 1
        elif i == 'D':
            if deq:
                if reversed % 2 == 0:  # 두 번 뒤집으면 그대로
                    deq.popleft()
                else:
                    deq.pop()
            else:
                flag = False
                break

    if flag:  # 뒤집기 할 것인지
        if reversed % 2 == 0:
            print("[" + ",".join(deq) + "]")
        else:
            deq.reverse()
            print("[" + ",".join(deq) + "]")
    else:
        print("error")
