import sys

#약수 구하는 거 생각해보기

N = int(sys.stdin.readline()) #약수의 개수
divs = list(map(int, sys.stdin.readline().split())) #진짜 약수들
divs.sort() #진짜 약수들을 작은 것부터 큰 것까지 나열

print(divs[0] * divs[-1]) #약수들 중 최소와 최대를 곱하면 N을 구할 수 있음