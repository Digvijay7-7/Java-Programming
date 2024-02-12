// main method for package program

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



math.ja

public class math {
    public void cube(int n) {
        System.out.println("THE CUBE OF THE GIVEN NUMBER IS :" + (n * n * n));
        System.out.println(" ");
    }

    public void factorial(int m) {
        int fact = 1;
        for (int i = 1; i <= m; i++) {
            fact = fact * i;
        }
        System.out.println("THE FACTORIAL OF THE NUMBER IS : " + fact);
        System.out.println(" ");
    }
}


convert.ja

import java.util.*;

public class convert {
    public void dectobin(int num) {
        int array[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int quotient = num;
        int remainder;
        int i = 0;
        while (quotient != 0) {
            remainder = quotient % 2;
            array[i] = remainder;
            quotient = quotient / 2;
            i++;
        }
        System.out.println("THE BINARY FORM OF " + num + " IS :");
        for (i = 7; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }

    public void dectooct(int num) {
        int array[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
        int quotient = num;
        int remainder;
        int i = 0;
        while (quotient != 0) {
            remainder = quotient % 8;
            array[i] = remainder;
            quotient = quotient / 8;
            i++;
        }
        System.out.println("THE OCTAL FORM OF " + num + " IS :");
        for (i = 7; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println(" ");
    }

    public void dectohex(int num) {
        char x;
        int array[];
        array = new int[10];
        int quotient = num;
        int remainder;
        int i = 0;
        while (quotient != 0) {
            remainder = quotient % 16;
            array[i] = remainder;
            quotient = quotient / 16;
            i++;
        }
        System.out.println("THE HEXADECIMAL FORM OF " + num + " is ");
        for (i = 7; i >= 0; i--) {
            if (array[i] > 9) {
                array[i] = array[i] + 55;
                x = (char) array[i];
                System.out.print(x);
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println(" ");
    }

    public void bintodec(int num) {
        int power;
        int count = 0;
        int quotient = num;
        while (quotient != 0) {
            quotient = quotient / 10;
            count++;
        }
        int array[];
        array = new int[count];
        quotient = num;
        int remainder;
        int j = 0;
        while (quotient != 0) {
            remainder = quotient % 10;
            array[j] = remainder;
            j++;
            quotient = quotient / 10;
        }
        int sum = 0;
        for (j = 0; j < count; j++) {
            power = (int) Math.pow(2, j);
            sum = sum + (array[j] * power);
        }
        System.out.println("THE DECIMAL FORM OF THE NUMBER " + num + " IS: " + sum);
        System.out.println(" ");
    }

    public void octtodec(int num) {
        int power;
        int count = 0;
        int quotient = num;
        while (quotient != 0) {
            quotient = quotient / 10;
            count++;
        }
        int array[];
        array = new int[count];
        quotient = num;
        int remainder;
        int j = 0;
        while (quotient != 0) {
            remainder = quotient % 10;
            array[j] = remainder;
            j++;
            quotient = quotient / 10;
        }
        int sum = 0;
        for (j = 0; j < count; j++) {
            power = (int) Math.pow(8, j);
            sum = sum + (array[j] * power);
        }
        System.out.println("THE DECIMAL FORM OF THE NUMBER " + num + " IS: " + sum);
        System.out.println(" ");
    }

    public void hextodec(String num) {
        int len = num.length();
        int j = 0;// for power counter.
        int sum = 0;
        int power;
        for (int i = len - 1; i >= 0; i--) {
            boolean b1 = Character.isAlphabetic(num.charAt(i));
            if (b1) {
                int x = (int) num.charAt(i);
                x = x - 55;
                power = (int) Math.pow(16, j);
                sum = sum + (x * power);
                j++;
            }
        }
        System.out.println("THE DECIMAL FORM OF THE NUMBER " + num + " IS: " + sum);
        System.out.println(" ");
    }
}
