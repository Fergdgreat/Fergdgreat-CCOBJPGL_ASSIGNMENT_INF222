public class Venus implements Planet {

    public void accept(Explorer astronaut){
        astronaut.visit(this);
   }
  }
