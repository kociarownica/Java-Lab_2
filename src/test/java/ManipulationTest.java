import static org.junit.Assert.*;

public class ManipulationTest {

    @org.junit.Test
    public void high() {
        Manipulation try_test = new Manipulation("hello");
        assertEquals("HELLO", try_test.High());
    }

    @org.junit.Test
    public void low() {
        Manipulation try_test = new Manipulation("HELLO");
        assertEquals("hello", try_test.Low());
    }

    @org.junit.Test
    public void length() {
        Manipulation try_test = new Manipulation("hello");
        assertEquals(5, try_test.Length());
    }

    @org.junit.Test
    public void connect() {
        Manipulation try_test = new Manipulation("hello");
        assertEquals("hello world!", try_test.Connect("world!"));
    }
}