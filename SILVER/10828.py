import sys
input = sys.stdin.readline

N = int(input())

stck = []

for _ in range(N):
    cmd = list(input().rstrip().split())
    
    if cmd[0] == "push":
        stck.append(cmd[1])
    elif cmd[0] == "pop":
        print(stck.pop() if len(stck) else -1)
    elif cmd[0] == "size":
        print(len(stck))
    elif cmd[0] == "empty":
        print(0 if len(stck) else 1)
    elif cmd[0] == "top":
        print(stck[-1] if len(stck) else -1)
