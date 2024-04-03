class A1FreezingHot extends ConsoleProgram {

    // Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.

    public void run(){

        // variables 
        int intTempOne;
        int intTempTwo;

        // input
        intTempOne = readInt("");
        intTempTwo = readInt("");

        // Checking input conditions 
        if (intTempOne < 0 && intTempTwo > 100 || intTempOne > 100 && intTempTwo <0){
            // output
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}