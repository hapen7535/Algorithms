add, sub = map(int, input().split())

if add < sub: #점수가 음수가 나오게 된다.
    print(-1)

else:
    a = (add + sub) // 2
    b = (add - sub) // 2
    if a+b == add and a-b == sub:
        print(max(a,b), min(a,b))
    else:
        print(-1)


