class A2HasTeen extends ConsoleProgram {

    // We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values via user input, output true if 1 or more of them are teen.

    public void run(){

        // variables 
        int intOne;
        int intTwo;
        int intThree;

        // input
        intOne = readInt("");
        intTwo = readInt("");
        intThree = readInt("");

        // Checking input conditions 
        if (intOne <= 19 && intOne >= 13 || intTwo <= 19 && intTwo >= 13 || intThree <= 19 && intThree >=13){
            // output
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}