import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {

    //System.out.print("Please enter your weight in kg: ");
    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();

    //System.out.print("Please enter your height in meters: ");
    double height = in.nextDouble();

    double bmi = weight/(height*height);

    //System.out.println("Your BMI is "+ bmi);
    System.out.println(bmi);
  }
}
