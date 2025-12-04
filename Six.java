
/**
 * Write a description of class Six here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Six
{
    public static void main (String [] args) { 
        int [] arr = {2,5,7,8,11};
        int sum = 0, count = 0 ; 
        
        for ( int num : arr) { 
            if(num % 2 != 0 ) {
                sum += num; 
                count ++; 
            } 
        }
        if (count > 0) 
        System.out.println( "Average:" + (double) sum / count); 
           else 
           System.out.println ("no odd numbers ") ; 
    }
}