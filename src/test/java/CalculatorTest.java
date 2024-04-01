import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        int result = Calculator.add(3, 5);
        Thread.sleep(15000);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testSubtraction() {
        int result = Calculator.subtract(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testMultiply(){
        int result=Calculator.multiply(10,5);
        Assert.assertEquals(result,50);
    }

    @Test
    public void testDivision(){
        int result=Calculator.divide(10,5);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testPower(){
        int result=Calculator.power(2,2);
        Assert.assertEquals(result,4);
    }

    @Test
    public void testMax(){
        int result=Calculator.max(1,2);
        Assert.assertEquals(result,2);
    }
}
