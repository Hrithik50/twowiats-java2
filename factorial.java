import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class factorial{
    public static void main(String [] args)
    {
        int n;
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for which you want to print the factorial of number");
        n = sc.nextInt();
        for(int i = n;i>0;i--)
        {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
