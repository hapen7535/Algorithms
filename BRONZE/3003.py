chess = list(map(int, input().split()))
ans = [1,1,2,2,2,8]

for i in range(len(ans)):
    print(ans[i]-chess[i], end=' ')