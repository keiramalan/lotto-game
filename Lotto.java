import java.util.Scanner;
/**
 * I have realised this should definitely be split up into different methods but I have
 * a media studies internal due in 2 days and I don't understand java method syntax so
 * i'm not gonna do that
 *
 * @author Keira Malan
 * @version 16/3/21
 */
public class Lotto
{
    // lotto needs 4 numbers
    final int LOTTONUM = 6;
    int numLines = 0;
    
    // Create draw object
    Draw draw = new Draw();
    
    // get winning nums
    int[] winningNums = draw.createArray(LOTTONUM);
    
    // count how many wins
    int matchCount = 0;
    int division1 = 0;
    int division3 = 0;
    
    int[][] lottoTicket;
    int newNum = 0;

    
    public Lotto() {
        // Initialising scanner class
        Scanner scan = new Scanner(System.in);
        
        // ask user how many lines they want (4-12)
        System.out.println("How many lines do you want? 4+");
        int numLines = scan.nextInt();
        
        // create array with [] however many mini arrys
        lottoTicket = new int[numLines][LOTTONUM];
        
        // ask user if they wanna choose number or randomly select (t/f)
        System.out.println("Would you like your numbers to be randomly selected?");
        System.out.println("(True/False)");
        boolean randomSelect = scan.nextBoolean();
        
        // for loop which populates each index with array
        for (int index = 0; index < lottoTicket.length; index++) {
            if (randomSelect) {
                // if user chose random selection, assign random nums to ticket
                lottoTicket[index] = draw.createArray(LOTTONUM);
            }
            
            else { // else loop through array and get user input to fill it
                // inform user which line theyre filling
                System.out.println("Line number " + (index + 1));
                for (int counter = 0; counter < lottoTicket[index].length; counter++) {
                    // get user input
                    System.out.println((counter + 1) + " number in line?");
                    int newNum = scan.nextInt();
                    
                    // put into array
                    lottoTicket[index][counter] = newNum;
                }
            }
        }
        
        for (int index = 0; index < lottoTicket.length; index++) {
            // reset match counter
            matchCount = 0;
            
             for (int counter = 0; counter < lottoTicket[index].length; counter++) {
                 // loop through each line and count how many matches
                 if (lottoTicket[index][counter] == winningNums[counter]) {
                     matchCount += 1;
                 }
                 
            }
            if ((matchCount > 2) && (matchCount < 6)) {
                // if there are 3 to 5 matches, lotto division 3 is achieved
                division3 += 1;
            }
            else if (matchCount == 6) {
                // if there are 6 matches, lotto divison 1 is achieved
                division1 += 1;
            }

        }
        
        // announce user's gambling success
        if (division1 > 0) {
            System.out.println("You won the ultimate prize!");
        }
        else if (division3 > 0) {
            System.out.println("You won division 3 " + division3 + " times, well done!");
        }
        else {
            System.out.println("Sorry, no wins this time!");
        }
    }
    

    
    



}
