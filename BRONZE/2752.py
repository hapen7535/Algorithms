a,b,c = map(int, input().split())
temp = 0

if a>b:
    temp = a
    a = b
    b = temp

if b>c:
    temp = b
    b = c
    c = temp

if a>b:
    temp = a
    a = b
    b = temp

print(a,b,c)

#sort 함수 사용가능


