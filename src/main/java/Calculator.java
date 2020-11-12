import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private Logger logger = LogManager.getLogger(Calculator.class);
    public int sum ( int a, int b){
        logger.debug("Following value of A {} and B{}",a,b);
        logger.info("sum is {}",a+b);
        logger.warn("this is a warning message");
        logger.fatal("a fatal message");
        return a+b;

    }


    public int divide( int a, int b){

        if(b==0){
            logger.warn("value of B can't be 0");
        }

        return a/b;

    }
}
