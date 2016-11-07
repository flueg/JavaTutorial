/*
 * Use finalize() to detect an object that
 * hasn't been properly cleaned up.
 *
 * @author FluegLau
 */

class Book {
    boolean CheckedOut = false;
    Book(boolean checkOut) {
        CheckedOut = checkOut;
    }
    void checkin() {
        CheckedOut = false;
    }
    protected void finalize() {
        if (CheckedOut)
            System.out.println("Erro: Checkec out");
        // Normally, you'll also do this:
        // super.finalize(); // Call the base class version.
    }

}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkin();

        //Drop the reference. GC will forget to clean up.
        // But finalize() will handle off the dirty job.
        new Book(true);

        //Force garbage collection & finalization:
        System.gc();
    }
}
