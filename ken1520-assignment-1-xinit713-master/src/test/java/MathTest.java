import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Testing strategy
 *
 * Consider the follwing test classes:
 * a < b, a > 0, b > 0
 * a > b, a < 0, b < 0
 * (0, 0) covers a = b, a = 0, b = 0
 * a < b, a = minint, b = maxint
 * a > b, a = maxint, b = minint
 *
 * Coverage strategy: Cover each test class
 *                    with one test value.
 */

class MathTest {

  // covers a < b, a > 0, b > 0
  @Test
  public void testALessThanBAndBothPositive() {
    assertEquals(2, Math.max(1, 2));
  }

  // covers a > b, a < 0, b < 0
  @Test
  public void testAGreaterThanBAndBothNegative() {
    assertEquals(-1, Math.max(-1, -3));
  }

  // covers a = b, a = 0, b = 0
  @Test
  public void testBothEqualAndZero() {
    assertEquals(0, Math.max(0, 0));
  }

  // covers a < b, a = minint, b = maxint
  @Test
  public void testALessThanBAndAMinBMax(){
    assertEquals(Integer.MAX_VALUE, Math.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
  }

  // covers a > b, a = maxint, b = minint
  @Test
  public void testAGreaterThanBAndAMaxBMin(){
    assertEquals(Integer.MAX_VALUE, Math.max(Integer.MAX_VALUE, Integer.MIN_VALUE));
  }

}
