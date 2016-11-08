public class VarArgsMethod {
    public static void f(Integer... args) {
        for (Integer i: args) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(new Integer(1), new Integer(2));
        f(2,3,4,5,6,7,8);
        f(9,10,new Integer(30), 11);
    }
}
