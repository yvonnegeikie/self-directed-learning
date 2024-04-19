# def fizzBuzz(n):
#     if n % 3 == 0  and n % 5 == 0:
#         print("FizzBuzz")
#     if n % 3 == 0 and  n % 5 != 0:
#         print("Fizz")
#     if n % 5 == 0 and  n % 3 != 0:
#         print("Buzz")
#     # if n % 3 !=  0 and n % 5 != 0:
#     else:
#         print(n)
# if __name__ == '__main__':
#     n = int(input().strip())
    
#     fizzBuzz(n)   

old = 0
list1 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
list2 = []
for i in list1:
    list2.append(i + old)
    old = i
print(list2)