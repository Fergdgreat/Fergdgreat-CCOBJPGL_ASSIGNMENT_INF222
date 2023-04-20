public class App {

    static boolean iWillReview  = true;
    static boolean iWillNotFail = true;

    public static void main (String[] args) throws Exception {
        
    App myReview = new App();

       //precondition
       assert iWillReview == true: "Nag laro ako ng NBA2k23 buong maghapon";
   
       // method
       exam();

       //postcondition
       assert iWillNotFail == true: "kasi nakalimutan ko mag aral para sa exam bukas ";

    }
    static void exam(){
      iWillNotFailNa = false;
      System.out.println("Exam day!");
          
   }
} 
