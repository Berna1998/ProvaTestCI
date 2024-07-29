import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void shouldSayHello()
    {
        assertEquals(1, Hello.Hello());
    }
}