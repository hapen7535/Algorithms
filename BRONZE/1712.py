a,b,c = map(int, input().split())
ans = 0

#a + bx < cx 이용

if (c-b) < 0 or c==b:
    ans = -1

else:
    ans = int((a/(c-b)) + 1)

print(ans)