/*
 * Show the order of initialization 
 *
 * @Author FluegLau
 *
 */
class Window {
    Window(int i) { System.out.println("Window(" + i + ")");}
}
class House {
    Window w1 = new Window(1); // Before constructor
    House() {
        // Shows that we are in constructor:
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {System.out.println("f()");}
    Window w3 = new Window(3);
}

public class InitOrder {
    public static void main (String[] args) {
        House h = new House();
        h.f();  // Shows that constructor is done
    }
}

