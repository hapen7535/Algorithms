import sys
input = sys.stdin.readline

n = int(input())

#인터프리터 언어이므로 함수는 위에 선언
def fact(a): #재귀함수를 이용할 경우 캐쉬 메모리를 많이 쓰게되어 시간 초과가 일어날 수 있다.
    num = 1
    for i in range(1, a+1):
        num *= i
    return num

for _ in range(n):
    a,b = map(int, input().split())
    ans = fact(b) // (fact(a) * fact(b-a))
    print(ans)
