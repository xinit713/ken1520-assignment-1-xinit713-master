import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Testing strategy
 *
 * Partition the inputs as follows:
 * text.length(): 0, 1, > 1
 * start:         0, 1, 1 < start < text.length() - 1,
 *                text.length() - 1, text.length()
 * text.length()-start: 0, 1, even > 1, odd > 1
 *
 * Include even- and odd-length reversals because
 * only odd has a middle element that doesn't move.
 *
 * Exhaustive Cartesian coverage of partitions.
 */

class StringManipulationTest {

   // covers text.length() = 0,
  //        start = 0 = text.length(),
  //        text.length()-start = 0
  @Test public void testEmpty() {
      assertEquals("", StringManipulation.reverseEnd("", 0));
  }

  //covers text.length() = 1, start = 0, text.length() - start = 1
  @Test
  public void testTextLength1StartAt0(){
    assertEquals("c",StringManipulation.reverseEnd("c", 0));
  }

  //covers text.length() = 1, start = 1, text.length() - start = 0
  @Test
  public void testTextLength1StartAt1(){
    assertEquals("c",StringManipulation.reverseEnd("c", 1));
  }

  //covers text.length() = 2, start = 0, text.length() - start = 2
  @Test
  public void testTextLength2StartAt0(){
    assertEquals("hc",StringManipulation.reverseEnd("ch", 0));
  }

  //covers text.length() = 2, start = 1, text.length() - start = 1
  @Test
  public void testTextLength2StartAt1(){
    assertEquals("ch",StringManipulation.reverseEnd("ch", 1));
  }

   //covers text.length() = 2, start = 2, text.length() - start = 0
   @Test
   public void testTextLength2StartAt2(){
    assertEquals("ch",StringManipulation.reverseEnd("ch", 2));
  }

   //covers text.length() = 3, start = 0, text.length() - start = 3
   @Test
   public void testTextLength3StartAt0(){
    assertEquals("god",StringManipulation.reverseEnd("dog", 0));
  }

   //covers text.length() = 3, start = 1, text.length() - start = 2
   @Test
   public void testTextLength3StartAt1(){
    assertEquals("dgo",StringManipulation.reverseEnd("dog", 1));
  }

   //covers text.length() = 3, start = 2, text.length() - start = 1
   @Test
   public void testTextLength3StartAt2(){
    assertEquals("dog",StringManipulation.reverseEnd("dog", 2));
  }

   //covers text.length() = 3, start = 3, text.length() - start = 0
   @Test
   public void testTextLength3StartAt3(){
    assertEquals("dog",StringManipulation.reverseEnd("dog", 3));
 }




}
