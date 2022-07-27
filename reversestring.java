import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class reverseletter
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string");
         String orgstr = sc.nextLine();
         String rev = "";
         int len  =  orgstr.length();
         for(int i = len-1;i>=0;i--)
         {
             rev  = rev + orgstr.charAt(i);
         }
         System.out.println(rev);
    }
}
