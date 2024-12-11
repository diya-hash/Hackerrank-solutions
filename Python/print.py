if __name__ == '__main__':
    n = int(input())
    mystr = ""
    for x in range(1,n):
        mystr += str(x)
    mystr += str(n)
    print(mystr)