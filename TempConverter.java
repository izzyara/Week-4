import java.util.*;
public class TempConverter
{
    public static void main (String[] args)
    {
    double fahrenheit;
    double celsius;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a temperature in fahrenheit: ");
    fahrenheit = input.nextInt();
  
    celsius = (5.0/9.0)*(fahrenheit - 32);


    System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
    input.close();

    }
}