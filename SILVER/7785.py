import sys

input = sys.stdin.readline

N = int(input())

list = {}

for i in range(N):
    name, state = input().split()
    if state == "enter":
        list[name] = True
    else:
        list.pop(name)

tmp = sorted(list.keys(), reverse=True)

print("\n".join(tmp))
