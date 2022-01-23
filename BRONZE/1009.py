count = int(input())
ans = 0
i = 0

for i in range(count):

    a,b = map(int, input().split())
    ans = pow(a,b,10) #pow(base, -exp, mod)
    if not ans: #나머지가 없는 경우
        print(ans + 10)
    else:
        print(ans)

