class C1BackToBack extends ConsoleProgram {

    // Given a string, take the last character and print a new string with the last character added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

    public void run(){

        // variables 
        String strWord;
        int intLength;
        String strLast;


        // input
        strWord = readLine("Enter your word: ");

        // Getting Length 
        intLength = strWord.length();

        // Getting Last Letter
        if (strWord.length() > 0){ 
            strLast = strWord.substring(intLength - 1);
            System.out.println(strLast + strWord + strLast); // Output
        }
    }
}

