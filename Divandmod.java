import java.util.*;
public class Divandmod
{
    public static void main (String[] args)
    {
    int num1;
    int num2;
    int quotient;
    int remainder;
    int quotient2;
    int remainder2;

    Scanner input = new Scanner(System.in);
    System.out.print("Ender an integer: ");
    num1 = input.nextInt();
    System.out.print("Ender an integer: ");
    num2 = input.nextInt();
    input.close();
 
    quotient = num1/num2;
    remainder = num1%num2;
    quotient2 = num2/num1;
    remainder2 = num2%num1;

    System.out.println(num1 + " / " + num2 + " = " + quotient);
    System.out.println(num1 + " % " + num2 + " = " + remainder);
    System.out.println(num2 + " / " + num1 + " = " + quotient2);
    System.out.println(num2 + " % " + num1 + " = " + remainder2);
    }
}