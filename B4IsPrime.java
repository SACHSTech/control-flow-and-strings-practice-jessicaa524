class B4IsPrime extends ConsoleProgram {

    /* Write a program that lets you enter an integer, and that will print appropriately "is a
        prime number" or "is a composite number". A number n is a prime number, if it
        has no divisors d, where 
        or more conveniently, where 
    */

    public void run(){

        // variables 
        int intVal;

        // input
        intVal = readInt("Enter an integer to check: ");

        // Checking input conditions 
        for (int a = 2; a < intVal; a++ ){
            //output
            if (intVal % a == 0){
                System.out.println(intVal + " is a composite number");
                return;
            }
                System.out.println(intVal + " is a prime number");
        }
       
    }
}

