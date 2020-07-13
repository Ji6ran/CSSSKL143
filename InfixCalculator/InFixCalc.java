import java.util.*;
import java.io.*;
/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
*
* Solution by Jibran
*/
public class InFixCalc {
    //example pattern: "3 + 5"
    //general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...  
    //special case: 
    //other special cases?

    public static void main(String[] args) {

        //String input = "4 + 4";
        String input = "4 + 4 / 2";
        String input2 ="1 * -3";
        String input3 = "2 + 2 / 4 - 18";
        Scanner key = new Scanner(System.in);
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
        int answer2 = calculate(input2);
        System.out.println("Answer is " + answer2);
        int answer3 = calculate(input3);
        System.out.println("Answer is " + answer3);

        Scanner in = null;


        try {
            in = new Scanner(new FileInputStream("/Users/Vykz/Documents/CSSSKL143/InfixCalculator/src/input1.txt"));
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found");
            System.exit(0);
        }

        while (in.hasNextLine() ) {
            calculate(in.nextLine());
        }

        //PrintWriter pw = new PrintWriter("output.txt");


    }

    //preconditions: all binary operations are separated via a space
    //postconditions: returns the result of the processed string
    public static int calculate(String input) {
        int lhs = 0; //short for left-hand side
        int rhs = 0; //short for right-hand side
        char operation = '0';
        StringTokenizer s = new StringTokenizer(input, " ");
        // establish a number first
        lhs = Integer.parseInt(s.nextToken()); // ParseInt makes the string token readable, converts from String to int
        while(s.hasMoreTokens()) { // while there is still an operation

            operation = s.nextToken().trim().charAt(0); // removes extra spaces around operations and assigns string operation to a char
            rhs = Integer.parseInt(s.nextToken()); // it'll take the string on the rhs of the operation and convert it to an int
                                                   // using parseInt method

            switch(operation) {
                case '+':
                    lhs = lhs + rhs;
                    break;
                case '-':
                    lhs = lhs - rhs;
                    break;
                case '*':
                    lhs = lhs * rhs;
                    break;
                case '/':
                    lhs = lhs / rhs;
                    break;
                default:
                    System.out.println("Invalid operation");
                    continue;
            }
        }
        return lhs;
    }
}
