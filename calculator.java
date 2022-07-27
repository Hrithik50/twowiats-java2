import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class basiccalculator{
    public static void main(String[] args)
    {
        double num1,num2; //stores the number of double type;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the operator(+,*,/,-");
        char operator = sc.next().charAt(0);
        double o =  0;
        switch(operator){
            //case to add numbers
            case '+':
                o = num1 + num2;
                break;
                //case to subtract numbers
            case '-':
                o = num1 - num2;
                break;
                //case to multiply numbers
            case '*':
                o = num1 * num2;
                break;
                //case to divide the numbers
            case '/':
                o = num1 / num2;
                break;
            default:
            System.out.println("You enter wrong input");
            break;
        }
        System.out.println("the final result:");
        System.out.println();
        // print the final result
        System.out.println(num1 + " " + operator + " " + num2
                           + " = " + o);
    }
}
