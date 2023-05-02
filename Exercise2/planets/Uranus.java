public class Uranus implements Planet {

    public void accept(Explorer astronaut){
        astronaut.visit(this);
   }
  }
