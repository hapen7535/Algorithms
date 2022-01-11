ans, area = map(int, input().split())
ans = ans * area #상근이가 적은 총 사람의 수

arr = list(map(int, input().split()))   #기사에 실린 사람의 수

for i in range(len(arr)):
    arr[i] = arr[i] - ans
    print(arr[i], end=' ')