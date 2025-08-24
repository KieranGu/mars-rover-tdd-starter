public class Direction {
    public static final Direction N = new Direction("N");
    public static final Direction E = new Direction("E");
    public static final Direction S = new Direction("S");
    public static final Direction W = new Direction("W");

    private String name;

    private Direction(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
