import static com.liu.flueg.util.Print.*;

public class Concatenation {
    public static void main(String []args) {
        String mango = "mango";
        // Note that use the String override operator + will create many String object in heap.
        // and this might cause performance reducing. (more garbage is produced)
        String s = "abc" + mango + "def" + 5244;
        print(s);
    }
}
/*
 * javap -c Concatenation:
public class Concatenation {
  public Concatenation();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String mango
       2: astore_1
       3: new           #3                  // class java/lang/StringBuilder
       6: dup
       7: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      10: ldc           #5                  // String abc
      12: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      15: aload_1
      16: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: ldc           #7                  // String def
      21: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: sipush        5244
      27: invokevirtual #8                  // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      30: invokevirtual #9                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      33: astore_2
      34: aload_2
      35: invokestatic  #10                 // Method com/liu/flueg/util/Print.print:(Ljava/lang/Object;)V
      38: return
}
 **/
