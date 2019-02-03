package interviewQuestions;

import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args) 
    {
        int n, a;
        String x = "";
        String bin="";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = x + "" + a;
            n = n / 2;
        }
        int len=x.length();
        for(int i=len-1;i>=0;i--) {
        	bin=bin+x.charAt(i);
        }
        System.out.println("Binary number:"+bin);
        s.close();
    }
}
