// Putting test code in a nested class.
// {main: TestBed$Tester}

import static com.liu.flueg.util.Print.*;

public class TestBed {
    public void f() {print("TestBed f()");}

    public static class Tester {
        public static void main(String[] args) {
            new TestBed().f();
        }
    }
}
