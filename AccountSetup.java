import java.util.*;
public class AccountSetup
{
    public static void main (String[] args)
    {
    String fullname;
    String password;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your full name: ");
    fullname = input.nextLine();
    System.out.print("Enter your password: ");
    password = input.nextLine();



    System.out.println("Your name is " + fullname);
    System.out.println("Your password is " + password);
    input.close();

    }
}