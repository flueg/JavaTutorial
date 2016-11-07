//@author FluegLau

class Bird {
    String name;

    // If we define any overloading constructor, the default constructor will not created by
    // compiler any longer.
    Bird(String name) {
        // If the para name is indentical with field name, use keyword 'this' to distinguish them.
        this.name = name;
    }

    Bird() {
        name = "flueg";
    }

    void chirp() {
        System.out.println(this.name + " is jijijijij...");
    }
}

public class TestBird {
    public static void main(String[] args) {
        Bird b1 = new Bird("ss");
        b1.chirp();
        Bird b2 = new Bird();
        b2.chirp();
    }
}
