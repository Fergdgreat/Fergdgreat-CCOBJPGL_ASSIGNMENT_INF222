public class Saturn implements Planet {

    public void accept(Explorer astronaut){
        astronaut.visit(this);
   }
}
