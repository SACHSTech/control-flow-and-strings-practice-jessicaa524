class D1GramsToPounds extends ConsoleProgram {


    /**
    * @author: 
    */
     public void run() {
      int intGrams = 100;
      double dblPounds;
      
      System.out.printf("%6s%10s%n", "Grams", "Pounds"); // %start of format at 6 characters (s is string), %start of the format at 10 characters, %n new line 
      System.out.println("------------------"); 
   
   
      for (intGrams = 100; intGrams <= 1000; intGrams += 100){
          dblPounds = intGrams * 0.0022046;
          System.out.printf("%6d %10.4f %n", intGrams, dblPounds); // %start of the format at 6 characters (d is for int #). %start at 10.4 (f is for float #), %space every line 
              }
    }
   }
   
