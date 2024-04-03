class A3Within10 extends ConsoleProgram {

    // Given 2 int values via user input, output whichever value is nearest to the value 10, or output 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    public void run(){

        // variables 
        int intValOne;
        int intValTwo;
        int intDifOne;
        int intDifTwo;

        // input
        intValOne = readInt("");
        intValTwo = readInt("");

        // Calculating differences 
        intDifOne = Math.abs(10 - intValOne);
        intDifTwo = Math.abs(10 - intValTwo);

        // Checking if numbers are equally close to 10 
        if (intDifOne == intDifTwo){
            System.out.println("0");
        } else {
            // Outputs which ever number closest to 10
            if (intDifOne > intDifTwo){
                System.out.println(intValTwo);
            }
            else {
                System.out.println(intValOne);
            }
            }
    }
}

