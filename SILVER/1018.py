#브루트 포스 이용
N,M = map(int, input().split())
orig = []
count = []

for _ in range(N):
    orig.append(input())

for a in range(N-7):
    for b in range(M-7):
        idxa = 0
        idxb = 0
        for i in range(a, a+8):
            for j in range(b, b+8):
                if (i + j) % 2 == 0: #인덱스가 짝수일 경우
                    if orig[i][j] != 'W':
                        idxa += 1
                    if orig[i][j] != 'B':
                        idxb += 1
                else: #인덱스 홀수
                    if orig[i][j] != 'B':
                        idxa += 1
                    if orig[i][j] != 'W':
                        idxb += 1
        count.append(min(idxa, idxb))

print(min(count))
