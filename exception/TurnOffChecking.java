//"Turnnign off" checked exceptions.
import java.io.*;
import static com.liu.flueg.util.Print.*;

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch(type) {
                case 0: throw new FileNotFoundException();
                case 1: throw new IOException();
                case 2: throw new RuntimeException("Where am I");
                default: return;
            }
        } catch (Exception e) {
            // Adapt to unchecked.
            // Note that should catch the RuntimeException by type Throwable
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception { }

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();

        // Runtime exception will go to console without a try block here.
        // It will crash the program definitly of course if we throw a 
        // runtime exception.
        //wce.throwRuntimeException(2);
        wce.throwRuntimeException(3);

        for (int i = 0; i<4; i++) {
            try {
                if (i < 3) wce.throwRuntimeException(i);
                else throw new SomeOtherException();
            } catch(RuntimeException re) {
                // Lets find the originating exception.
                try {
                    throw re.getCause();
                } catch(FileNotFoundException e) {
                    print("FileNotFoundException: " + e);
                } catch(IOException e) {
                    print("IOException: " + e);
                } catch (Throwable e) {
                    // Noth that we can only catch the Throwable instead of RuntimeException.
                    print("RuntimeException: " + e);
                }
            } catch (SomeOtherException e) {
                print("SomeOtherException: " + e);
            }
        }
    }
}

