import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HailstoneTest {

    @Test
    public void test1(){
        assertEquals("",Hailstone.sequence(1));
    }

    @Test
    public void test3(){
        assertEquals("3 10 5 16 8 4 2 ",Hailstone.sequence(3));
    }

    @Test
    public void test16(){
        assertEquals("16 8 4 2 ",Hailstone.sequence(16));
    }



}
