import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger("Log4jDemo");
		
		logger.trace("This is a trace message");
		logger.error("This is a error message");
		logger.warn("This is a warn message");
		
	}

}
