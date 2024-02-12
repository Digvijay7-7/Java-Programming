import p1.math;
import p1.p12.convert;
import java.util.*;

class packagedemo
{
    public static void main(String a[])
    {

        System.out.println("ENTER THE DECIMAL NUMBER");
        Scanner ob = new Scanner (System.in);
        int n = ob.nextInt();

        math ob1 = new math();
        ob1.cube(n);
        ob1.factorial(n);

        convert ob2 = new convert();
        ob2.dectobin(n);
        ob2.dectooct(n);
        ob2.dectohex(n);

        System.out.println("ENTER THE BINARY NUMBER");
        int n1 = ob.nextInt();
        ob2.bintodec(n1);

        System.out.println("ENTER THE OCTAL NUMBER");
        int n2 = ob.nextInt();
        ob2.octtodec(n2);

        String n4 = ob.nextLine(); //to take the buffer enters

        System.out.println("ENTER THE HEXA-DECIMAL STRING");
        String n3 = ob.nextLine();
        ob2.hextodec(n3);
    }
}