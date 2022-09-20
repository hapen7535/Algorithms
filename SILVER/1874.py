import sys

input = sys.stdin.readline

stck = []
op = []
count = 0
flag = True

n = int(input())
x = [int(input()) for _ in range(n)]

for i in x:

    while count < i:
        count += 1
        stck.append(count)
        op.append('+')

    if stck[-1] == i:
        stck.pop()
        op.append('-')

    else:
        flag = False
        break

if not flag:
    print("NO")

else:
    print('\n'.join(op))
