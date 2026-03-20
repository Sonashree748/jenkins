import org.junit.Test;
import static org.junit.Assert.*;
import org.example.HelloWorld;

public class HelloTest {

    @Test
    public void testCase() {
        assertEquals("Hello From Jenkins Pipeline", HelloWorld.testMessage());
    }
}
