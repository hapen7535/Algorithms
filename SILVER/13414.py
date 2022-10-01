import sys
input = sys.stdin.readline

K, L = map(int, input().split())

applyList = {}

for i in range(L):
    applyList[input().rstrip()] = i

applyList_sorted = sorted(applyList.items(), key = lambda x : x[1])

count = 0
for i in applyList_sorted:
    if count == K:
        break
    count += 1
    print(i[0])
