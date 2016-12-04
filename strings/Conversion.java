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
        //Seems integer could not implictly convert to float.
        //f.format("f: %f\n", w);
        //f.format("e: %e\n", w);
        f.format("x: %x\n", w);
        f.format("h: %h\n", w);
    }
}
