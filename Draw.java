
/**
 * Draw 6 numbers in an array for a lotto game
 *
 * @author Keira Malan
 * @version 11/3/21
 */
public class Draw
{
    // constants - num of numbers, limit of lotto num (40 or sumn)
    final int LOTTO_LIMIT = 40;
    final int NUM_AMOUNT = 6;
    
    /*
     * constructor for objects of class Draw
     */
    public Draw() {
        // create array
        int[] lottoDraw = new int[NUM_AMOUNT];
        // randomly assign number up to 40 in each section of array w for loop
        for (int index = 0; index < NUM_AMOUNT; index ++) {
            lottoDraw[index] = (int) ((Math.random() + 1) * LOTTO_LIMIT);
            // new number
            lottoDraw[index] = (int) ((Math.random() + 1) * LOTTO_LIMIT);
            // if new number not in array aready add to array
            // else loop for new number
            // make it a while loop????
        }
            
        // loop through to check for repeats
        // nested loop
        //for (int checkFor: lottoDraw){
            //for (int num: lottoDraw) {
                //if (
                // check if x number is in for loop
    }
    
    /*
     * Return final array
     */
    public int[] returnList() {
        // return array
    }
}

