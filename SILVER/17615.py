import sys
input = sys.stdin.readline

N = int(input().strip())
balls = input().strip()
count = []

right_side = balls.rstrip('R')
count.append(right_side.count('R'))

right_side = balls.rstrip('B')
count.append(right_side.count('B'))

left_side = balls.rstrip('R')
count.append(left_side.count('R'))

left_side = balls.rstrip('B')
count.append(left_side.count('B'))

print(min(count))
