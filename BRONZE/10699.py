from datetime import datetime

print(datetime.today().strftime("%Y-%m-%d"))

""" 어제 날짜는 아래와 같이 구한다.
yesterday = datetime.today() - timedelta(1)
print(yesterday.strftime("%Y-%m-%d")
"""