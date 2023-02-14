
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvenOrOddTest {
    static Lab eoo;
    @BeforeClass
    public static void setUp(){
        eoo = new Lab();
    }

    /**
     * Because 4 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest1(){
        
    }
    /**
     * Because 0 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest2(){
        
    }
    /**
     * Because 12 is even, eoo.decide(4) should return "Even".
     */
    @Test
    public void evenTest3(){
        
    }
    /**
     * Because 3 is odd, eoo.decide(3) should return "Odd".
     */
    @Test
    public void oddTest1(){
        
    }
    /**
     * Because -5 is odd, eoo.decide(3) should return "Odd".
     */
    @Test
    public void oddTest2(){
        
    }
}
