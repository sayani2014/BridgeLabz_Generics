# BridgeLabz_Generics : Find Maximum Problem using Generics

## Usecases
1. Given 3 Integers find the maximum
  - Ensure to test code with the Test Case.
  - To ensure your Code works you need 3 test cases with Max Number at 1st, 2nd and 3rd
  - Use Integer Object and compareTo UC 1 method to test the maximum number
2. Given 3 Floats find the maximum
3. Given 3 Strings find the maximum

Test Case : 1. Given Max Number at 1st Position return the Same Number
               (Ensure the test data has Max Number in the First position)
            2. Given Max Number at 2nd Position return the Same Number
               (Ensure the test data has Max Number in the Second position)
            3. Given Max Number at 3rd Position return the Same Number
               (Ensure the test data has Max Number in the Third position)
               
Refractor 1: Refactor all the 3 to One Generic Method and find the maximum
    - Ensure the Generic Type extends Comparable
    - Make the test case work  
Refractor 2: Refactor to create Generic Class to take in 3 variables of Generic Type
    - Ensure the Generic Type extends Comparable
    - Write parameter constructor
    - Write testMaximum method to internally call the static testMaximum method passing the 3 instance variables
    - Define new test case to use the Generic Class
    
4. Extend the max method to take more then three parameters 
  - Use options and sorting   
    
5. Extend the max method to also print the max to std out using Generic Method 
  - Write printMax Generic Method which is internally called from testMaximum    

