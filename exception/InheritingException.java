// Creating my own exception class
import static com.liu.flueg.util.Print.*;

class SimpleException extends Exception {}

public class InheritingException {
    public void f() throws SimpleException {
        print("Throw SimpleException from f()");
        // let the compiler build the default constructor
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException ie = new InheritingException();
        try {
            ie.f();
        } catch(SimpleException e) {
            e.printStackTrace(System.out);
            print("Catch SimpleException:"+e.toString());
        }
    }

}
