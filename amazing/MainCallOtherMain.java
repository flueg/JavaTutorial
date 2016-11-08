public class MainCallOtherMain {
    public static void main(String[] args) {
        System.out.println("Starting MainCallOtherMain");
        //printArray(args);
        for (String s : args) {
            System.out.println(s + ' ');
        }
        //String[] nargs = {"main", "call", "other", "main"};
        // main is a static method.
        Other.main(new String[]{"main", "call", "other", "main"});
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
