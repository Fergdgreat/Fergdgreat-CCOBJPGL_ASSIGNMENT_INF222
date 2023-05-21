public class App {
    public static void main(String[] args) throws Exception {
         // Create object from pet class
         Bulldog myPet = new Bulldog();

         myPet.howl();
         System.out.println("The color of my ToyPoodle's fur is " + myPet.furColor );
         System.out.println();
         System.out.println("And he is " + myPet.personality );
         System.out.println();
         
    }
}
