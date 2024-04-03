class C2EveryNth extends ConsoleProgram {


    /**
    * Given a non-empty string and an int N, return the string made starting with character 0, and then every Nth char of the string.
    * @author: 
    */
     public void run() {
     
      String strString;
      int intNumber;
      int intLength;
      String strFinal = ""; 
      int intTimes;
      String strCharacter;
     
      strString = readLine("Enter a word: ");
      intNumber = readInt("Enter a number: ");
     
      intLength = strString.length(); // Calculating Length
   
   
      for (intTimes = 0; intTimes < intLength; intTimes += intNumber){ // Seeing times needed to check, Cannot exceet word length 
          strCharacter = strString.substring(intTimes, intTimes + 1); // Extracts a char out every # writting, if int 5 the first 0, 5, 10 would be outputted
          strFinal += strCharacter;
      }
          System.out.println(strFinal); // Output
    }
   }
   