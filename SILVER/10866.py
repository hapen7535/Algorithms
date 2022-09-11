import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
deq = deque([])

for i in range(N):
  cmd = list(input().rstrip().split())
  
  if cmd[0] == "push_front":
    deq.appendleft(cmd[1])
    
  elif cmd[0] == "push_back":
    deq.append(cmd[1])
    
  elif cmd[0] == "front":
    print(deq[0] if len(deq) else -1)
  
  elif cmd[0] == "back":
    print(deq[-1] if len(deq) else -1)
    
  elif cmd[0] == "size":
    print(len(deq))  
  
  elif cmd[0] == "empty":
    print(0 if len(deq) else 1)
    
  elif cmd[0] == "pop_front":
    print(deq.popleft() if len(deq) else -1)
    
  elif cmd[0] == "pop_back":
    print(deq.pop() if len(deq) else -1)  
