def is_leap(year):
    leap = False
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                leap = True
            else:
                leap = False
        else:
            leap = True

    # Write your logic here

    return leap


year = int(input())
n = is_leap(year)
if n:
    print("Leap Year")
else:
    print("Not a Leap Year")
