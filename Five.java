
/**
 * Write a description of class Five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Five
{
    public static void main ( String [] args ) { 
        int [] arr = {3,5,7,9,11};
        int target= 7; 
        
        for(int i = 0; i < arr . length; i ++) {
            if (arr[i]== target){
        System.out.println("Found" + target + " at index" + i);     
        
        break;
      }
    }
  }
}