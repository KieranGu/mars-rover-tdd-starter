import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String commandList) {
        for (char command : commandList.toCharArray())
            executeCommand(command);
    }

    private void executeCommand(char command) {
        if (command=='M') {
            moveForward();
        }
        else if (command=='B') {
            moveBackward();
        }
        else if (command=='L') {
            turnLeft();
        }
        else if (command=='R') {
            turnRight();
        }else {
            throw new IllegalArgumentException("Wrong command");
        }
    }

    private void moveBackward() {
        if (direction.equals(Direction.N)) {
            y--;
        } else if (direction.equals(Direction.E)) {
            x--;
        } else if (direction.equals(Direction.S)) {
            y++;
        } else if (direction.equals(Direction.W)) {
            x++;
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

    private static final List<Direction> DIRECTIONS = Arrays.asList(
            Direction.N, Direction.E, Direction.S, Direction.W
    );
    private void turnLeft() {
        int currentIndex = DIRECTIONS.indexOf(direction);
        int newIndex = (currentIndex + 3) % DIRECTIONS.size(); // +3来往前找
        direction = DIRECTIONS.get(newIndex);
    }
    private void turnRight() {
        int currentIndex = DIRECTIONS.indexOf(direction);
        int newIndex = (currentIndex + 1) % DIRECTIONS.size();
        direction = DIRECTIONS.get(newIndex);
    }


    public String report() {
        return "(" + x + ", " + y + ") " + direction.toString();
    }
}
