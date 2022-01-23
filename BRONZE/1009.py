count = int(input())
ans = 0
i = 0

for i in range(count):

    a,b = map(int, input().split())
    ans = pow(a,b,10) #pow(base, -exp, mod)
    if not ans:
        print(ans + 10)
    else:
        print(ans)

