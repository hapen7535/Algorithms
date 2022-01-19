a = int(input())
b = list(map(int, input()))

for i in b[::-1]:
    print(a * i)

b = int("".join(map(str, b)))

print(a*b)