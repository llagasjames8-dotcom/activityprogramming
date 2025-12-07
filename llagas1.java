
/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Activity
{
    public static void main ( String [] arg) {
        Scanner scanner = new Scanner (System.in); 
        int number;
        
        do {
            System.out.print("Enter a number between 1 and 100:");
            number = scanner.nextInt ();
            
        } while ( number < 1 || number >100); 
        
        System.out.println("Valid number entered: " + number); 
        scanner.close(); 
     }
}
