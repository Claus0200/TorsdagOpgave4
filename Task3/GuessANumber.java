import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		// Create a Scanner object   
        Scanner scanner = new Scanner(System.in);	 
    	// Read user input
        int numberGuess = 0;
        //use hasNextDouble to check if input is numeric, 
        // if so...
        if (scanner.hasNextInt()) {
            numberGuess = scanner.nextInt();
            if (numberGuess == rnd_number) { //   Compare it with the random number
                System.out.println("You guessed correct, congrats!!!"); //   Let the user know the result of the comparison
            }
            else {
                if (numberGuess > rnd_number) {
                    System.out.println("You guessed a number too big, try again!"); //   Help the user by revealing wether the guess was lower or higher than the target number
                }
                else {
                    System.out.println("You guessed a number too low, try again!"); //   Help the user by revealing wether the guess was lower or higher than the target number
                }
                makeAGuess(); //   Let the user try again by calling this method recursively
            }
        }
        else { // if input was not numeric show an error message and call this method recursively
            System.out.println("Whoops, you didnt enter a numeric number, please try again"); 
            makeAGuess();
        }
    }
   

}