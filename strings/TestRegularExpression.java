//: strings/TestRegularExpression.java
// Allows you to easily try out regular expressions.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }
import java.util.regex.*;
import static com.liu.flueg.util.Print.*;

public class TestRegularExpression {
  public static void main(String[] args) {
      // a pattern to match words begins and ends with vowel. e.g. apple
      // Note that we should escape the \w as \\w here.
      Pattern pp = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou])\\w+?[aeiou]\\b)");
      Matcher mm = pp.matcher("Arline ate eight apples and one orange while Anita had't any");
      while(mm.find()) {
        print("Match \"" + mm.group() + "\" at positions " +
          mm.start() + "-" + (mm.end() - 1));
      }
    if(args.length < 2) {
      print("Usage:\njava TestRegularExpression " +
        "characterSequence regularExpression+");
      System.exit(0);
    }
    print("Input: \"" + args[0] + "\"");
    for(String arg : args) {
      print("Regular expression: \"" + arg + "\"");
      Pattern p = Pattern.compile(arg);
      Matcher m = p.matcher(args[0]);
      while(m.find()) {
        print("Match \"" + m.group() + "\" at positions " +
          m.start() + "-" + (m.end() - 1));
      }
    }
  }
} /* Output:
Input: "abcabcabcdefabc"
Regular expression: "abcabcabcdefabc"
Match "abcabcabcdefabc" at positions 0-14
Regular expression: "abc+"
Match "abc" at positions 0-2
Match "abc" at positions 3-5
Match "abc" at positions 6-8
Match "abc" at positions 12-14
Regular expression: "(abc)+"
Match "abcabcabc" at positions 0-8
Match "abc" at positions 12-14
Regular expression: "(abc){2,}"
Match "abcabcabc" at positions 0-8
*///:~
