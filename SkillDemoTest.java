
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test public void testHighestInteger(){
        int[] list = new int[]{4, 3, 76, 65, 34};
        assertEquals(76, SkillDemo.highestInteger(list));

    }
}
