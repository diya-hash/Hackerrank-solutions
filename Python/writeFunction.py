if __name__ == '__main__':
    year = int(input())
    leap = False
    if year%4 == 0 and year%100 != 0:
        leap = True
    elif year%4 == 0 and year%100 == 0 and year%400 != 0:
        leap = False
    elif year%4 == 0 and year%400 == 0:
        leap = True
    else:
        leap = False

    print(leap)