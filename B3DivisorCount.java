class B3DivisorCount extends ConsoleProgram {

    // Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.

    public void run(){

        // variables 
        int intVal;

        // input
        intVal = readInt("Enter an integer to find the divisors: ");

        // Checking input conditions 
        for(int intDivisor = 1; intDivisor <= intVal; intDivisor++){
            if (intVal % intDivisor == 0){ 
            }
            System.out.println(intDivisor);
        }
    }
}
