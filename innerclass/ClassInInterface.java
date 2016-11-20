// Class declared in interface is automatically pubilc and static (which will be a nested class)
// {main: ClassInInterface$Test}
// This is the technic used in auto-test for a class.

import static com.liu.flueg.util.Print.*;

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public void howdy() {
            print("Test howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
