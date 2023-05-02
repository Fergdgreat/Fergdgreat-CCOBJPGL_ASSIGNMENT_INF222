
public interface Explorer  {

    void visit(Venus venus);

    void visit(Mars mars);

    void visit(Saturn saturn);

    void visit(Uranus uranus);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }
}
