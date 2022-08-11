import sys
input = sys.stdin.readline

def gcd(a,b):
  while b != 0:
    a = a % b
    a,b = b,a
  return a

A1,B1 = map(int, input().split())
A2,B2 = map(int, input().split())

gcdValue = gcd(B1,B2)
num = A1 * (B2//gcdValue) + A2 * (B1//gcdValue)
demon = B1 * B2 // gcdValue

#기약분수
gcdValue2 = gcd(demon,num)
print(num // gcdValue2, demon //gcdValue2)
