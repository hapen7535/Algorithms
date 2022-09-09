import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
cards = deque(list(range(1, N+1)))

while (len(cards)>1):
  cards.popleft()
  tmp = cards.popleft()
  cards.append(tmp)
  
print(cards[0])  
