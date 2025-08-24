import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
