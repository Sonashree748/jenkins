<<<<<<< HEAD
import org.junit.Test;
import static org.junit.Assert.*;
import org.example.HelloWorld;

public class HelloTest {

    @Test
    public void testCase() {
        assertEquals("Hello From Jenkins Pipeline", HelloWorld.testMessage());
=======
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
public class HelloTest {
    @Test
    public void testMessage() {
        String msg = "Hello";
        assertEquals("Hello", msg);
>>>>>>> 21340d5 (My Jenkins)
    }
}
