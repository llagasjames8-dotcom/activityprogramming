
/**
 * Write a description of class Llagas8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Llagas8
{
    public static void main (String [] args){
        int [] A = {5, 4, 2, 9};
        int [] B = new int[A.length];
        
        for (int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
        System.out.print("B: ");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
    }
}