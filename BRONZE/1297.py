#피타고라스 정리 이용
d, h, w = map(int, input().split())

ratio = d/pow(((h**2)+(w**2)),0.5)

print(int(ratio*h),int(ratio*w))