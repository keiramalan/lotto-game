
/**
 * Draw 4 numbers, prize is given if they match
 *
 * @author Keira Malan
 * @version 16/03/21
 */
public class Strike
{
    // strike needs 4 numbers
    final int STRIKENUM = 4;
    // Create draw object
    Draw draw = new Draw();
    // get winning nums
    int[] winningNums = draw.createArray(STRIKENUM);
    // print winning num
    
    // get player nums
    int[] playerNums = draw.createArray(STRIKENUM);
    int strikeCounter = 0;

    /**
     * Constructor for objects of class Strike
     */
    public Strike()
    {
        // iterate through winning num draw and try to match any user nums using index
        for (int index = 0; index < winningNums.length; index++) {
            if (winningNums[index] == playerNums[index]) {
                // if numbers match add to strike counter and tell user
                strikeCounter += 1;
                System.out.println("You matched a number!");
            }
        }

        // if statements for different sucess levels
        if (strikeCounter == 1) {
            System.out.println("You matched one number!");
        }
        
        else if (strikeCounter == 0) {
            System.out.println("No matches! Better luck next time...");
        }
        
        else if (strikeCounter == 2) {
            System.out.println("You matched two numbers!");
        }
        
        else if (strikeCounter == 3) {
            System.out.println("You matched three numbers!");
        }
        else if (strikeCounter == 4) {
            System.out.println("STRIKE! You matched four numbers.. You're rich!");
        }

    }

}
