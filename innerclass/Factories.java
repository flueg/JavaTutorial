// Factory Pattern
// using anonymous inner class technic.
import static com.liu.flueg.util.Print.*;

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}


class Implementation1 implements Service {
    private Implementation1() {}    // Private constructor. usually used in Singleton Pattern
    public void method1() {print("Implimentation1 method1");}
    public void method2() {print("Implimentation1 method2");}

    // Anonymous inner class
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {return new Implementation1();} 
    };// Semicolon is required here.
}

class Implementation2 implements Service {
    private Implementation2() {}    // Private constructor. usually used in Singleton Pattern
    public void method1() {print("Implimentation2 method1");}
    public void method2() {print("Implimentation2 method2");}

    // Anonymous inner class
    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {return new Implementation2();
        }
    };// Semicolon is required here.
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}

