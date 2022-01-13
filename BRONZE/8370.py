#만약에 입력의 수가 4개가 아니라, 유동적으로 바뀔 수 있다고 생각하고 문제를 풀었다.
import sys

seats = list(map(int,sys.stdin.readline().split()))
ans = 0
for i in range(len(seats)):
    if(i%2 != 0):
        continue
    ans += seats[i]*seats[i+1]

print(ans)