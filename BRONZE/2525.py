hour, min = map(int, input().split())
time = int(input())
hour = hour + time//60
min = min + time%60

if min >= 60:
    hour = hour + 1
    min = min - 60

#시간은 제일 뒤에 설정해준다.

if hour >= 24:
    hour = hour - 24

print(hour,min)