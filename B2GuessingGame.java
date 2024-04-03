import java.util.Random;
class B2GuessingGame extends ConsoleProgram {

    /* Write a program GuessingGAME that lets the computer generate a secret number 
    (an integer between 1 and 100, for your friend to guess. If they guess too high, print: 
    "too high, guess again." If they guess too low, print: "too low, guess again". If they guess the number, 
    let the program stop and print "congratulations". If they've guessed incorrectly after 5 attempts, print "Nice Try" */

    public void run(){

        // variables 
        int intAttemps;
        int intGuess;
        Random intRandom = new Random();
        int intSecretNum;

        // Setting secret # 
        intSecretNum = intRandom.nextInt(1,101);

        // Setting up # of Attemps
        for (intAttemps = 1; intAttemps <= 5; intAttemps++){
            intGuess = readInt("Guess a number between 1-100: ");
            if (intGuess == intSecretNum){
                System.out.println("congratulations!");
            }
            else if (intGuess > intSecretNum && intAttemps != 5){
                System.out.println("Too high, guess again");
            }
            else if (intGuess < intSecretNum && intAttemps != 5){
                System.out.println("Too low, guess again");
            }
            else {
                System.out.println("Nice try");
            }
        }



    }
}


