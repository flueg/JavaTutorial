// An exception that reports through a Logger.
//
import java.util.logging.*;
import java.io.*;
import static com.liu.flueg.util.Print.*;

class LoggingException extends Exception {
    // default logger will write to System.err (stderr)
    private static Logger logger = Logger.getLogger("LoggingExceptio");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String []args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            print("Caught " + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            print("Caught " + e);
        }
    }
}
