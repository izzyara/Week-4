import java.util.*;
public class GradeAvg
{
    public static void main (String[] args)
    {
    int Grade1;
    int Grade2;
    int Grade3;
    int Grade4;
    int Grade5;
    int Avg;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter 5 grades then press enter: ");
    Grade1 = input.nextInt();
    Grade2 = input.nextInt();
    Grade3 = input.nextInt();
    Grade4 = input.nextInt();
    Grade5 = input.nextInt();

    Avg = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5)/5;
    System.out.println("Your grade average is " + Avg);

    input.close();

    }

}