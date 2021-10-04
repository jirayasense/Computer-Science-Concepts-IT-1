# generators.py
import math


def factorials(n):
    for i in range(n):
        yield math.factorial(i)


fact_iter = factorials(5)

for i in fact_iter:
    print(i)