// Proper inheritance of an inner class.

import static com.liu.flueg.util.Print.*;

class Egg {
    public Egg(){print("New Egg()");}
    protected class Yolk {
        public Yolk() {print("Egg.Yolk()");}
        public void f() {print("Egg.Yolk.f()");}
    }
    private Yolk y = new Yolk(); // Instance initialization
    public void insertToYolk(Yolk yy) { y = yy;}
    public void g() {y.f();}
}

public class BigEgg extends Egg {
    public class Yolk extends Egg.Yolk {
        public Yolk() {print("BigEgg.Youk()");}
        public void f(){print("BigEgg.Yolk.f()");}
    }
    public BigEgg() {insertToYolk(new Yolk());}

    public static void main(String[] args) {
        Egg e = new BigEgg();
        e.g();
    }
}

/**
 * 1. New BigEgg()
 * 2. init Egg()
 * 3. instance init Egg.y
 *   output: Egg.Yolk()
 * 4. constructor init Egg()
 *   output: New Egg()
 * 5. constructor BigEgg()
 * 6. invokes insertToYolk()
 * 7. New BigEgg.Yolk()
 * 8. init Egg.Yolk Constructor
 *   output: Egg.Yolk()
 * 9. constructor BigEgg.Yolk()
 *   output: BigEgg.Yolk()
 * 10. invoke e.g()
 *   output: BigEgg.Yolk.f()
 */
