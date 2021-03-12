
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
    // make an input later, this is how many numbers user wants
    int num_amount = 6;
    int potentialNum = 0;
    
    public Draw() {
        int [] newArray = createArray(num_amount);
        for (int element : newArray) {
            System.out.println(element);
        }
    }
    
    /*
     * constructor for objects of class Draw
     */
    public int[] createArray(int num_amount) {
        // create array
        int[] lottoDraw = new int[num_amount];
        // randomly assign number up to 40 in each section of array w for loop
        for (int index = 0; index < num_amount; index ++) {
            // while loop
            // create number
            potentialNum = (int) (Math.random() * (LOTTO_LIMIT + 1));
            // check number isnt in array using method
            boolean repeat = checkForNum(potentialNum, lottoDraw);
            
            // if method resturns true, loop until unique number is found
            while (repeat) {
                potentialNum = (int) (Math.random() * (LOTTO_LIMIT + 1));
                repeat = checkForNum(potentialNum, lottoDraw);
            }
            
            // add to array
            lottoDraw[index] = potentialNum;
        }
        return lottoDraw;
    }
    
    /*
     * Method to check if number is in array
     */
    public boolean checkForNum(int checkFor, int[] lottoDraw) {
        
        boolean repeat = false;
        // for loop that goes thru length of array
        for (int counter = 0; counter < lottoDraw.length; counter++) {
            // if potential num is in array, break loop and return True
            if (checkFor == lottoDraw[counter]) {
                repeat = true;
                // break loop
                break;
            }
            
        }
        
        return repeat;
    }
    

}

