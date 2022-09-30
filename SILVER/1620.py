import sys
input = sys.stdin.readline
N, M = map(int, input().split())

pokeNumKey = {}
pokeNameKey = {}

for i in range(N):
    name = input().strip()
    pokeNumKey[i] = name
    pokeNameKey[name] = i

for _ in range(M):
    problem = input().strip()
    if problem.isdigit() == True:
        print(pokeNumKey[int(problem)-1])
    else:
        print(pokeNameKey[problem]+1)
