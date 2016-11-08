public class MainCallOtherMain {
    public static void main(String[] args) {
        System.out.println("Starting MainCallOtherMain");
        for (String s : args) {
            System.out.println(s + ' ');
        }
        String[] nargs = {"main", "call", "other", "main"};
        // main is a static method.
        Other.main(nargs);
    }
}

// This class could not be declared as "public"
class Other {
    public static void main(String[] args) {
        System.out.println("Some one is calling me Other");
        for(String s : args) {
            System.out.println(s + ' ');
        }
    }
}
