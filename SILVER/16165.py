import sys

input = sys.stdin.readline

N, M = map(int, input().split())

groupNames, groupMems = {}, {}

for _ in range(N):
    groupName = input().strip()
    groupNum = int(input())

    groupMemList = []

    for _ in range(groupNum):
        name = input().strip()
        groupNames[name] = groupName
        groupMemList.append(name)

    groupMems[groupName] = groupMemList

for _ in range(M):
    problem = input().strip()
    problemType = int(input())

    if problemType:
        print(groupNames[problem])
    else:
        print('\n'.join(sorted(groupMems[problem])))
