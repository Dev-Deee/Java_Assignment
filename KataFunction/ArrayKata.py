def  maximumIn(user_input):
    largest = user_input[0]
    for count in range(len(user_input)):
        if(user_input[count] > largest):
            largest = user_input[count]       
    return largest
    
def  minimumIn(user_input):
    smallest = user_input[0]
    for count in range(len(user_input)):
        if(user_input[count] < smallest):
            smallest = user_input[count]        
    return smallest
        
def  additonOfArray(user_input):
    additon = 0
    for count in range(len(user_input)):
        additon += user_input[count] 
    return additon
        
def  additonOfEvenNumbers(user_input):
    additon = 0
    for count in range(len(user_input)):
        if(user_input[count] % 2 == 0):
            additon += user_input[count] 
    return additon
        
def  additonOfOddNumbers(user_input):
    additon = 0
    for count in range(len(user_input)):
        if(user_input[count] % 2 != 0):
            additon += user_input[count] 
    return additon
        
def MinimumAndMaximumOfArray(user_input):
    largest = user_input[0]
    smallest = user_input[0]

    for item in user_input:
        if item > largest:
            largest = item
        if item < smallest:
            smallest = item

    return [largest, smallest]
  
def  noOfOddNumbersIn(user_input):
    counter = 0
    for count in range(len(user_input)):
        if(user_input[count] % 2 != 0):
            counter += 1
    return counter
        
def  noOfEvenNumbersIn(user_input):
    counter = 0
    for count in range(len(user_input)):
        if(user_input[count] % 2 == 0):
            counter += 1
    return counter
        
def evenNumbersIn(user_input):
    new_array = []
    for count in user_input:
        if count % 2 == 0:
            new_array.append(count)
    return new_array

def oddNumbersIn(user_input):
    new_array = []
    for count in range(len(user_input)):
        if user_input[count] % 2 != 0:
            new_array.append(user_input[count])
    return new_array

def squareNumbersIn(user_input):
    new_array = []
    for count in range(len(user_input)):
        square = user_input[count] * user_input[count]
        new_array.append(square)
    return new_array


array_of_integers = [1,2,3,4,5,6,7,8,9,10]

print(maximumIn(array_of_integers))
print(minimumIn(array_of_integers))
print(additonOfArray(array_of_integers))
print(additonOfEvenNumbers(array_of_integers))
print(additonOfOddNumbers(array_of_integers))
print(MinimumAndMaximumOfArray(array_of_integers))
print(noOfOddNumbersIn(array_of_integers))
print(noOfEvenNumbersIn(array_of_integers))
print(evenNumbersIn(array_of_integers))
print(oddNumbersIn(array_of_integers))
print(squareNumbersIn(array_of_integers))
    

    

    
