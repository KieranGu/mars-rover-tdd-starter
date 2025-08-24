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
    private void turnLeft()
    {
        if(direction.equals(Direction.N)) {
            direction = Direction.W;
        } else if(direction.equals(Direction.E)) {
            direction = Direction.N;
        } else if(direction.equals(Direction.S)) {
            direction = Direction.E;
        } else if(direction.equals(Direction.W)) {
            direction = Direction.S;
        }
    }
    private void turnRight()
    {
        if(direction.equals(Direction.N)) {
            direction = Direction.E;
        } else if(direction.equals(Direction.E)) {
            direction = Direction.S;
        } else if(direction.equals(Direction.S)) {
            direction = Direction.W;
        } else if(direction.equals(Direction.W)) {
            direction = Direction.N;
        }
    }


    public String report() {
        return "(" + x + ", " + y + ") " + direction.toString();
    }
}
