import java.util.*;
public class Digits_revised
{
    public static void main (String[] args)
    {
    int hundreds;
    int tens;
    int ones;
    int num;
    Scanner input = new Scanner(System.in);
    System.out.println("Ender a three digit number: ");
    num = input.nextInt();
    input.close():
 
    ones = num%10;
    tens = (num/10)%10;
    hundreds = (num-(tens*10)-(ones))/100;

    System.out.println("the hundreds place digit is " + hundreds);
    System.out.println("the tens place digit is " + tens);
    System.out.println("the ones digit is " + ones);
    }
}