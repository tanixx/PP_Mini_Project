def binary_or(binary_num1, binary_num2):
    num1 = int(binary_num1, 2)
    num2 = int(binary_num2, 2)
    result = num1 | num2

    result_binary = bin(result)[2:]

    return result_binary
binary_number1 = input("Enter the first binary number: ")
binary_number2 = input("Enter the second binary number: ")
result_binary = binary_or(binary_number1, binary_number2)
print(f"Bitwise OR of {binary_number1} and {binary_number2} is: {result_binary}")
