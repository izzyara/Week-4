public class Digits
{
        public static void main (String[] args)
    {
    int hundreds;
    int tens;
    int ones;
    int num;

    num = 526;
    ones = num%10;
    tens = (num/10)%10;
    hundreds = (num-(tens*10)-(ones))/100;

    System.out.println("the hundreds place digit is " + hundreds);
    System.out.println("the tens place digit is " + tens);
    System.out.println("the ones digit is " + ones);
    }
}