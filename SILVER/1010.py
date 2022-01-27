import sys
input = sys.stdin.readline

n = int(input())

#인터프리터 언어이므로 함수는 위에 선언
def fact(a): #재귀함수를 이용할 경우 메모리 부족으로 시간 초과가 일어날 수 있다.
    num = 1 #재귀함수를 쓰더라도 메모이제이션을 쓰면 효율적인 코드가 될 수 있다.
    for i in range(1, a+1):
        num *= i
    return num

for _ in range(n):
    a,b = map(int, input().split())
    ans = fact(b) // (fact(a) * fact(b-a))
    print(ans)
