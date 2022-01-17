arr = list(map(int, input().split()))

arr.sort()
arrSet = set(arr)

#집합형 자료형은 중복을 허용하지 않음
if len(arrSet) == 1:
    print(10000 + arr[0]*1000)

elif len(arrSet) == 2:
    print(1000 + arr[1]*100)

elif len(arrSet) == 3:
    print(arr[-1]*100)


