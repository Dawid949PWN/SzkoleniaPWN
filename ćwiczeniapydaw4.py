
liczba = 10
suma = 0

while liczba <= 100:
    if liczba % 10 == 0 or liczba % 1 == 0:
        suma += liczba
        print(liczba, suma)
    liczba += 1


# 10, 11, 12, 14, 15... 100
# 10, 21, 33, 46, 60...

