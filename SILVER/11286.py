import sys, heapq
input = sys.stdin.readline

heap = []
N = int(input())

for _ in range(N):
    x = int(input())
    
    if x == 0:
        if len(heap) == 0:
            print(0)
        else:
            print(heapq.heappop(heap)[1])
    else:
        if x > 0: #절댓값
            heapq.heappush(heap, (x,x))
        elif x < 0:
            heapq.heappush(heap, (-x,x))
            
#python heapq 안쓰고
