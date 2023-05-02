public class App {

    public static void main(String[] args) {

        Mars mars = new Mars();
        Saturn saturn = new Saturn();
        Venus venus = new Venus();
        Uranus uranus = new Uranus();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        venus.accept(astronaut);
        uranus.accept(astronaut);
        
        mars.accept(rover);
        saturn.accept(rover);
        venus.accept(rover);
        uranus.accept(rover);
        

    }
}
