import static org.junit.Assert.*;

public class ManipulationTest {

    @org.junit.Test
    public void high() {
        Manipulation try_test = new Manipulation();
        assertEquals("HELLO", try_test.High("hello"));
    }

    @org.junit.Test
    public void low() {
        Manipulation try_test = new Manipulation();
        assertEquals("hello", try_test.Low("HELLO"));
    }

    @org.junit.Test
    public void length() {
        Manipulation try_test = new Manipulation();
        assertEquals(5, try_test.Length("hello"));
    }

    @org.junit.Test
    public void connect() {
        Manipulation try_test = new Manipulation();
        assertEquals("hello world!", try_test.Connect("hello", "world!"));
    }
}