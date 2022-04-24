import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
   Scanner in = new Scanner(System.in);
    Int height = in.nextInt();
    System.out.println("Enter height in meters");

    
    Scanner in = new Scanner(System.in); 
    int weight = in.nextInt();  
    System.out.println("Enter weight");
    
    System.out.println("your BMI is : ", weight*(height*height));
  }
}
