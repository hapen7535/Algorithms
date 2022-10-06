import sys
input = sys.stdin.readline

start, end, streamEnd = input().split()

dicList = {}
result = {}

for i in sys.stdin:
    time, name = i.strip().split()
    
    if time <= start:
        dicList[name] = time
        
    elif end <= time <=streamEnd:
        if name in dicList:
            result[name] = 1
            
print(len(result))
