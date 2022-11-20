import sys
input = sys.stdin.readline

N, M = map(int, input().split())

keywords = set([input().rstrip() for _ in range(N)])

for _ in range(M):
    left_keywords = input().rstrip().split(',')
    for key in left_keywords:
        if key in keywords:
            keywords.remove(key)
    print(len(keywords))
