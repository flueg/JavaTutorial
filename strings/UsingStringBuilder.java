import static com.liu.flueg.util.Print.*;
import java.util.*;

public class UsingStringBuilder {
    public static Random rand = new Random(System.currentTimeMillis() / 1000);
    public String toString() {
        StringBuilder re = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            re.append(rand.nextInt(100));
            re.append(",");
        }
        re.delete(re.length()-1, re.length());
        re.append("]");
        return re.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        print(usb.toString());
    }
}
