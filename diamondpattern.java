import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class diamondpattern
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of rows");
         int n = sc.nextInt();
         for(int i = 1;i<=n;i++)  ///step1;this will print first upper half of daimond:
         {
             for(int space = 1;space<=n-i;space++)
             {
                 System.out.print(" ");
             }
                 for(int j = 1;j<=2*i-1;j++)
                 {
                     System.out.print("*");
                 }
             System.out.println();
         }
         //step2:now we printing the second lower helf of the diamond:
         for(int i = n-1;i>=1;i--)
         {
             for(int space = 1;space<= n-i;space++)
             {
                 System.out.print(" ");
             }
             for(int j = 1;j<=2*i-1;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}
