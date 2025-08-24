import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {
    @Test
    void test_move_Forward() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("M");
        // Then
        assertEquals("(0, 1) N", rover.report());
    }
    @Test
    void test_move_Backward() {
        // Given
        MarsRover rover = new MarsRover(1, 1, Direction.N);
        // When
        rover.execute("B");
        // Then
        assertEquals("(1, 0) N", rover.report());
    }

    @Test
    void test_turn_Left() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("L");
        // Then
        assertEquals("(0, 0) W", rover.report());
    }

    @Test
    void test_turn_Right() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("R");
        // Then
        assertEquals("(0, 0) E", rover.report());
    }

    @Test
    void test_multiple_Commands() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When
        rover.execute("MRMLMLLB");
        // Then
        assertEquals("(1, 3) S", rover.report());
    }

    @Test
    void test_wrong_command() {
        // Given
        MarsRover rover = new MarsRover(0, 0, Direction.N);
        // When & Then
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> rover.execute("X"));
        assertEquals("Wrong command", exception.getMessage());
    }
}
