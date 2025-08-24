import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {
    @Test
    void test_moveForward() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("M");
        assertEquals("(0, 1) N", rover.report());
    }

    @Test
    void test_moveBackward() {
        MarsRover rover = new MarsRover(1, 1, Direction.N);
        rover.execute("B");
        assertEquals("(1, 0) N", rover.report());
    }

    @Test
    void test_turnLeft() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("L");
        assertEquals("(0, 0) W", rover.report());
    }

    @Test
    void test_turnRight() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("R");
        assertEquals("(0, 0) E", rover.report());
    }

    @Test
    void test_multipleCommands() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("MRMLMLLB");
        assertEquals("(1, 3) S", rover.report());
    }

    @Test
    void test_wrong_command() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> rover.execute("X"));
        assertEquals("Wrong command", exception.getMessage());
    }
}
