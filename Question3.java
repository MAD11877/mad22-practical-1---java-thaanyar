import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
    //System.out.print("Enter your integer: ");
    Scanner in = new Scanner(System.in);
    int selected_number = in.nextInt();

    int answer = selected_number*selected_number;

    System.out.println(answer);
  }
}
