#4초
import sys
input = sys.stdin.readline

S = list(map(str, input().rstrip()))

ans = set()

for i in range(1, len(S)+1):
    for j in range(len(S)):
        ans.add("".join(S[j:i+j]))
        
print(len(ans))

#참고 코드 0.3초
S = input()

SLen, ans = len(S), 0

for i in range(1, SLen + 1):
    tmp = []
    for j in range(SLen + 1 - i):
        tmp.append(S[j:j + i])
    ans += len(set(tmp))

print(ans)
