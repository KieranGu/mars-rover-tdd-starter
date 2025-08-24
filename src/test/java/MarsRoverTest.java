import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void test_moveForward() {
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        rover.execute("M");
        assertEquals("(0, 1) N", rover.report());
    }
}
