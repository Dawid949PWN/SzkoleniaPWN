import random
sekret = random.randint(1,10)
jeszcze_zgadujemy = True
proba = 1

while jeszcze_zgadujemy and proba <= 3:
    wpisana = int(input("Twój strzał: "))
    if wpisana == sekret:
        print("TRAFIŁEŚ ORAZ WYGRAŁEŚ W PRÓBIE", proba)
        jeszcze_zgadujemy = False
    else:
        print("NIE TRAFIŁEŚ")

        if ...:
            print("Za mała!")
        else:
            print("Za duża")

        proba += 1


