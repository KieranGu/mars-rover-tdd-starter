public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String command) {
        if (command.equals("M")) {
            moveForward();
        }
    }

    private void moveForward() {
        if (direction.equals(Direction.N)) {
            y++;
        } else if (direction.equals(Direction.E)) {
            x++;
        } else if (direction.equals(Direction.S)) {
            y--;
        } else if (direction.equals(Direction.W)) {
            x--;
        }
    }

    public String report() {
        return "(" + x + ", " + y + ") " + direction.toString();
    }
}
