import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class permutationacombination
{
    public static  long factorial(int num)
    {
        //int f;
        int fact = 1;
        for(int i = num;i>0;i--)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int p = (int)(factorial(n) / factorial(n - r));
        int c = (int)(factorial(n) 
                      / (factorial(n - r) * factorial(r)));
        System.out.println("permuatation is " + p);
        System.out.println("combination is " + c);
    }
}
