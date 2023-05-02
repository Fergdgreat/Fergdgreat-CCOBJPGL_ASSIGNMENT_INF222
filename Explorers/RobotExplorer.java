public class RobotExplorer implements Explorer {
 
    public void visit(Venus venus) {
        System.out.println("Loading instructions from system... exploring Venus");
    }

   
    public void visit(Mars mars) {
        System.out.println("Loading instructions from system... exploring Mars");
    }

   
    public void visit(Saturn saturn) {
        System.out.println("Loading instructions from system... exploring Saturn");
    }

    public void visit(Uranus uranus) {
        System.out.println("Loading instructions from system... exploring Uranus");
    }
}
