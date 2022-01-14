
print("""SHIP NAME      CLASS          DEPLOYMENT IN SERVICE
N2 Bomber      Heavy Fighter  Limited    21        
J-Type 327     Light Combat   Unlimited  1         
NX Cruiser     Medium Fighter Limited    18        
N1 Starfighter Medium Fighter Unlimited  25        
Royal Cruiser  Light Combat   Limited    4         
""")


"""  숫자 뒤 공백이 상관없다면 아래 방식도 가능
data = [
                ["N2 Bomber", "Heavy Fighter", "Limited", 21],
                ["J-Type 327", "Light Combat", "Unlimited", 1],
                ["NX Cruiser", "Medium Fighter", "Limited", 18],
                ["N1 Starfighter", "Medium Fighter", "Unlimited", 25],
                ["Royal Cruiser", "Light Combat", "Limited", 4]
        ]

print("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE")

for v in data:
    name, cla, dep, service = v
    print("{:<14} {:<14} {:<10} {:<2}".format(name, cla, dep, service))
"""