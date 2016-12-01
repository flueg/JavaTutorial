// How an exception can be lost
import static com.liu.flueg.util.Print.*;

class VeryImportantException extends Exception {
    public String toString(){
        return "A very important exception!";
    }
}

class FluegException extends Exception {
    public String toString() {
        return "A trivial Exception.";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void g() throws FluegException {
        throw new FluegException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                // Note that here will drop the excetion from f();
                lm.g();
            }
        } catch(Exception e) {
            print(e);
        } 

        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block will
            // silence any thrown exception.
            return;
        }
    }
}

