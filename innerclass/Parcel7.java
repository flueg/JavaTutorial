// Returning an instance ofan anonymous inner class.
//
import static com.liu.flueg.util.Print.*;
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;
            public int value() {return i;}
        }; // Semicolon required in this case.
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        print(c.value());
    }
}
