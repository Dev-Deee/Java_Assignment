def  isEven(userInput) :
    if userInput % 2 ==0:
        return True
    else:
        return False
 
def  isPrime(userInput): 
    factors = 0
    for count in range (1, userInput):
        if userInput % count == 0:
            factors += 1;                
    if factors == 2:
        return True         
    else:
        return False

def  subtract(userInput, userInputTwo):
    subtraction = 0
    if userInput < userInputTwo:
        subtraction =userInputTwo - userInput
    elif userInputTwo < userInput:
        subtraction = userInput - userInputTwo       
    return subtraction
     
def divide(userInput, userInputTwo) :
    result = 1
    if userInputTwo == 0:
        return 0
    else: 
        result = userInput // userInputTwo
        return result
      
def  factorOf(userInput):
    factors = 0
    for count in range (1, userInput + 1, 1):
        if userInput % count == 0:
            factors +=1
    return factors
 
def  isSquare(userInput):
    counter = 0
    for count in range (1, userInput):
        if count * count == userInput:
             counter += 1
    if counter == 1:
        return True
    else :
         return False

def  isPalindrome(userInput):
    remainder = 0
    reverse = 0
    newNumber = userInput
    while(newNumber != 0) :
        remainder = newNumber % 10
        reverse = reverse * 10 + remainder
        newNumber//=10
    if reverse == userInput:
            return True
    else:
            return False
 
def factorial(userInput):
    factorial = 1
    for count in range(userInput, 0, -1):
        factorial *=count
     
    return factorial
     
def  squareOf(userInput):
    square = userInput * userInput
    return square
     

number = 10
numbers = 5
test = 121
print(isEven(number))
print(isPrime(number))
print(subtract(number, numbers))
print(divide(number, numbers))
print(factorOf(number))
print(isSquare(number))
print(isPalindrome(test))
print(factorial(numbers))
print(squareOf(numbers))

 
