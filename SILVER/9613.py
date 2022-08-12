import sys
input = sys.stdin.readline

def gcd(a,b):
  while b!=0:
    a = a % b
    a,b = b,a
  return a

t = int(input())

for _ in range(t):
  numbers = list(map(int, input().split()))
  result = 0
  for i in range(1, len(numbers)-1):
    for j in range(i+1, len(a)):
      result += gcd(numbers[j], numbers[i])
  print(result)      
