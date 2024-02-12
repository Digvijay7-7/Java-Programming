//1.	Implement java program to find factorial of given number.
import java.util.Scanner;
class Factorial
{
    public static void main (String[] args)
    {
        System.out.print("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int n = Integer.parseInt(args[0]);
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
       System.out.println(fact);
    }
}