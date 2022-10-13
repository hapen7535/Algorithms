import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):

    x1, y1, x2, y2 = map(int, input().split())
    n = int(input())
    cnt = 0
    
    for _ in range(n):
        cx, cy, r = map(int, input().split())
        # 점과 점 사이 거리식 이용
        d1 = (((x1 - cx) ** 2) + ((y1 - cy) ** 2)) ** 0.5
        d2 = (((x2 - cx) ** 2) + ((y2 - cy) ** 2)) ** 0.5

        # 출발점과 도착점 둘 중 하나가 원 안에 있을 경우 행성계 간의 이동이 있음
        if (d1 < r and d2 > r) or (d1 > r and d2 < r):
            cnt += 1

    print(cnt)
