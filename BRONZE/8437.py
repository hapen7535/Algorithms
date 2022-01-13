num = int(input())
diff = int(input()) #여기서 2로 나누어 버리면 소수가 나올 수 있어 나중에 반올림이 될 수 있다 결과적으로 값이 상이하게 될 수 있음
print((num + diff)//2)
print((num - diff)//2)