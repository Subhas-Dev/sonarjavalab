package math;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathTest {

  @Test
  public void testAdd() throws Exception {
  	assertEquals(Math.add(2, 5), 7);
  }
  
  @Test
  public void testMul() throws Exception {
  	assertEquals(Math.add(2, 5), 7);
  }
  
  @Test
  public void testDiv() throws Exception {
  	assertEquals(Math.div(20, 5), 4);
  }
}
