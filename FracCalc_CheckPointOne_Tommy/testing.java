
/**
 * Write a description of class testing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class testing
{
    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equations
        Scanner console = new Scanner(System.in);
        String input;
        
        System.out.print("Enter your expression: ");
        input = console.nextLine();
        
        while(!input.equals("stop")){
            System.out.println("hello");
            System.out.print("Enter your expression: ");
            input = console.nextLine();
        }
    }
}
