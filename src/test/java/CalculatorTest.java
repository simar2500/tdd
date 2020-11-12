import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest<Public> {

private static Calculator calculator;
private static Logger logger = LogManager.getLogger(Calculator.class);
@Before
public void setup(){
    calculator = new Calculator();
}

    @BeforeClass
    public static void setup2(){
    logger.info("Running Before Class");

    }


    @Test
    public void SumTest() {
        Assert.assertEquals(4,calculator.sum(2,2));
    }

    @Test
    public void Divivdetest()throws Exception{
    Assert.assertEquals(2,calculator.divide(2,1));

    }
}
