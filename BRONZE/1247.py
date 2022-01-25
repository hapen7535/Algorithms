from sys import stdin

for i in range(3):
    N = int(stdin.readline()) #input이 stdin.readline()보다 느림
    arr = [int(stdin.readline()) for _ in range(N)]

    if sum(arr) == 0:
        print(0)

    elif sum(arr) > 0:
        print("+")

    else:
        print("-")