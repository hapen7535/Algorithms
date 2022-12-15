def solution(number, limit, power):
    answer = []
    
    for i in range(1,number+1):
        divisor=0
        for j in range(1,i+1):
            if i%j==0:
                divisor+=1
        if divisor<=limit:
            answer.append(k)
        else:
            answer.append(power)
        
    return sum(answer)
