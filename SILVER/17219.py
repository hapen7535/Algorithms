import sys

input = sys.stdin.readline

N, M = map(int,input().split())
PwList = {}

for _ in range(N):
    web, pw = input().split()
    PwList[web] = pw

for _ in range(M):
    print(PwList[input().strip()])
