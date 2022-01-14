print("""NFC West       W   L  T
-----------------------
Seattle        13  3  0
San Francisco  12  4  0
Arizona        10  6  0
St. Louis      7   9  0

NFC North      W   L  T
-----------------------
Green Bay      8   7  1
Chicago        8   8  0
Detroit        7   9  0
Minnesota      5  10  1""")



"""비슷하게 테이블 형식으로 출력하는 방법은 아래와 같다.
from tabulate import tabulate

data = [
    ["Seattle",13,3,0],
    ["San Francisco",12,4,0],
    ["Arizona",10,6,0],
    ["St. Louis",7,9,0]
]

print(tabulate(data, headers=["NFC West","W","L","T"]))

"""