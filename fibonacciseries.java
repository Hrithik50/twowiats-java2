import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.lang.Math;
public class fibonacciseries{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto which you want to print fibonacci series");
        n = sc.nextInt();
        System.out.println(a);
        for(int i =0;i<n;i++)
        {
            c = a+b;
            System.out.println(c);
            a = b; //here 'b' becomes ' a' for next calculations
            b = c;  //here c becomes 'b'  for next calculations
        }
    }
}
