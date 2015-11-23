/*Tommy Li
11/22/15
*/ 

import java.util.*;
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equations
        Scanner console = new Scanner(System.in);
        String input;
        String sentinel = "quit";
        
        System.out.print("Enter your expression: ");
        input = console.nextLine();
        
        while(!input.equals(sentinel)){
            System.out.println("The second operand is " + produceAnswer(input));
            System.out.print("Enter your expression: ");
            input = console.nextLine();
        }
        
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String userInput)
    { 
        // TODO: Implement this function to produce the solution to the input
        String firstOperand;
        String operator;
        String secondOperand;
        int firstIndex = 0;
        int lastIndex = 0;
        
        while(userInput.charAt(lastIndex) != ' '){
            lastIndex++;
        }
        firstOperand = userInput.substring(firstIndex, lastIndex - 1);
        
        lastIndex++;
        firstIndex = lastIndex;
        while(userInput.charAt(lastIndex) != ' '){
            lastIndex++;
        }
        operator = userInput.substring(firstIndex, lastIndex - 1);
        
        lastIndex++;
        firstIndex = lastIndex;
        while(lastIndex <= userInput.length()){
            lastIndex++;
        }
        secondOperand = userInput.substring(firstIndex, lastIndex - 1);
        
        secondOperand = parsingFractions(secondOperand);
        
        return secondOperand;
    }
    
    
    public static void parsingFractions(String operand){
        String wholeString;
        String numeratorString;
        String denominatorString;
        int whole;
        int numerator;
        int denominator;
        String parsedFraction;
        
        if(operand.indexOf('_') == -1){
            if(operand.indexOf('/') == -1){
                numberator = 0;
                denominator = 1;
            } else {
                whole = 0;
            }
        } else {
            operand.substring(0,operand.indexOf('_'));
        }
        
        parsedFraction = "whole:" + whole + " numerator:" + numerator + " denominator:" + denominator;
        return parsedFraction;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
