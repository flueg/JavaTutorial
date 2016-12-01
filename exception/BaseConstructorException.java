// The derived-class constructor cannot catch exceptions thrown by its base-class constructor.
//
import static com.liu.flueg.util.Print.*;

class BaseException extends Exception {
    public String toString() {
        return "From BaseException ";
    }
}

class DerivedException extends Exception {
    public String toString() {
        return "From DerivedException ";
    }
}

class Base {
    public Base() throws BaseException {
        print("Base constructor");
        throw new BaseException();
    }
}

public class BaseConstructorException extends Base {
    public BaseConstructorException() throws BaseException, DerivedException { 
        // Since the super() must be the first statement inside derived-class constructor.
        // We cannot catch the base-class exception inside the derived-class constructor.
        super(); 
        //try {
        //    print("Derived constructor");
        //} catch (BaseException e) {
        //    print(e);
        //}
        
        // no chance to be executed
        print("Derived constructor");
        throw new DerivedException();
    }

    public static void main(String[] args) {
        try {
            BaseConstructorException d = new BaseConstructorException();
        } catch (BaseException e){
            print(e);
        } catch (DerivedException e) {
            print(e);
        }
    }
}
