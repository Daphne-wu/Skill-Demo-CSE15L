import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
  @Test
  public void testMultiply() {
    assertEquals(5, SkillDemo.multiply(5, 3)); //fails at first!
  }
}
