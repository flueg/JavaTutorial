//: strings/ReplacingStringTokenizer.java
import java.util.*;
import static com.liu.flueg.util.Print.*;

public class ReplacingStringTokenizer {
  public static void main(String[] args) {
    String input = "But I'm not dead yet! I feel happy!";
    StringTokenizer stoke = new StringTokenizer(input);
    while(stoke.hasMoreElements())
      printnb(stoke.nextToken() + " ");
    print();
    print(Arrays.toString(input.split(" ")));
    // Use scanner to replace StringTokenizer is more flexable and powerful
    Scanner scanner = new Scanner(input);
    while(scanner.hasNext())
      print(scanner.next() + " ");
  }
} /* Output:
But I'm not dead yet! I feel happy!
[But, I'm, not, dead, yet!, I, feel, happy!]
But I'm not dead yet! I feel happy!
*///:~
