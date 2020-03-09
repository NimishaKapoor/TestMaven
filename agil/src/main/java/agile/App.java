package agile;
import java.util.Scanner;

/**
 * Calculator
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println ("Calculator Menu: \n");
        System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter the number from the options: \n");
        char operation = sc.next ().charAt (0);
        try
        {
          System.out.println ("\n Please enter first number: \n");
          float firstNum = sc.nextFloat ();
          System.out.println ("\n Please enter second number: \n");
          float secondNum = sc.nextFloat ();
          switch (operation)
        {
          case '1':
          System.out.println ("The result of calculation is: " + (firstNum + secondNum));
          break;
    
          case '2':System.out.println ("The result of calculation is: " + (firstNum - secondNum));
          break;
    
          case '3':System.out.println ("The result of calculation is: " + (firstNum * secondNum));
          break;
    
          case '4':System.out.println ("The result of calculation is: " + (firstNum / secondNum));
          break;
    
          default:System.out.println ("\n Please select a valid operation");
    
        }
        }
        catch (Exception e)
        {
          System.out.println ("\n Please select a valid number");
          System.out.println ("\n Exception" + e);
        }
        finally
        {
          sc.close ();
        }
      }
}
