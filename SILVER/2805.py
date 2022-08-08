import sys
input = sys.stdin.readline

def binarySearch(arr, m):
  start = 1
  end = max(arr)
  while start <= end:
    mid = (start + end) // 2
    
    total = 0
    for i in arr:
      if i >= mid:
        total += i - mid
    
    if total >= m: #적어도 M미터의 나무
      start = mid + 1
    else:
      end = mid - 1
  
  print(end)      

N, M = map(int, input().split())
tree = sorted(map(int, input().split()))
binarySearch(tree, M)


