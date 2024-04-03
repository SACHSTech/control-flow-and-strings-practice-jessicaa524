import java.util.Random;
class B1DiceGame extends ConsoleProgram {

    /* Write a program that lets you simulate the rolling of 100 pairs of dice. For each roll,
    If the pair adds up to 2, print "snake eyes!"
    If the pair adds up to 7, print "lucky seven"
    if the pair adds up to any other sum, do not print out anything */

    public void run(){

        // variables 
        int intDieOne = 0;
        int intDieTwo = 0;
        Random intRandom = new Random();

        // Generating 100 rolls 
        for (int i = 0; i < 100; i++){
            intDieOne = intRandom.nextInt(7);
            intDieTwo = intRandom.nextInt(7);
            // output
            if (intDieOne + intDieTwo == 2){
                System.out.println("snake eyes!");
            } 
            if (intDieOne + intDieTwo == 7){
                System.out.println("lucky seven");
            }

        }


    }
}

