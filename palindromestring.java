import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class palindromestring{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String orgstr = str;
        String rev = "";
        int len = str.length();
        for(int i = len-1;i>=0;i--)
        {
         rev = rev + str.charAt(i);   
        }
        if(orgstr.equals(rev))
        {
            System.out.println("String is palnidrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }
    }
}
