import static com.liu.flueg.util.Print.*;
import java.math.*;
import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        char u = 'a';
        print("u = 'a'");
        f.format("s: %s\n", u);
        //Cannot conver a char to integer
        //f.format("d: %d\n", u);
        f.format("c: %c\n", u);
        f.format("b: %b\n", u);
        // Cannot conver to float neither
        //f.format("f: %f\n", u);
        //f.format("e: %e\n", u);
        //f.format("x: %x\n", u);
        f.format("h: %h\n", u);

        int v = 121;
        print();
        print("v = 121");
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
        f.format("s: %s\n", v);
        // Cannot conver to float
        //f.format("f: %f\n", v);
        //f.format("e: %e\n", v);
        f.format("x: %x\n", v);
        f.format("h: %h\n", v);

        BigInteger w = new BigInteger("50000000000000");
        print();
        print("w = new BigInteger(\"50000000000000\")");
        f.format("d: %d\n", w);
        // No such unicode range
        //f.format("c: %c\n", w);
        f.format("b: %b\n", w);
        f.format("s: %s\n", w);
        //Seems integer could not implictly be converted to float.
        //f.format("f: %f\n", w);
        //f.format("e: %e\n", w);
        f.format("x: %x\n", w);
        f.format("h: %h\n", w);

        double x = 123.456;
        print();
        print("double x = 123.455");
        //Seems float could not implictly be converted to integer.
        //f.format("d: %d\n", x);
        //f.format("c: %c\n", x);
        f.format("b: %b\n", x);
        f.format("s: %s\n", x);
        f.format("f: %f\n", x);
        f.format("e: %e\n", x);
        //f.format("x: %x\n", x);
        f.format("h: %h\n", x);

        Conversion y = new Conversion();
        print();
        print("y = new Conversion()");
        //f.format("d: %d\n", y);
        //f.format("c: %c\n", y);
        f.format("b: %b\n", y);
        f.format("s: %s\n", y);
        //f.format("f: %f\n", y);
        //f.format("e: %e\n", y);
        //f.format("x: %x\n", y);
        f.format("h: %h\n", y);

        Boolean z = false;
        print();
        print("z = new Boolean()");
        //f.format("d: %d\n", z);
        //f.format("c: %c\n", z);
        f.format("b: %b\n", z);
        f.format("s: %s\n", z);
        //f.format("f: %f\n", z);
        //f.format("e: %e\n", z);
        //f.format("x: %x\n", z);
        f.format("h: %h\n", z);

    }
}
