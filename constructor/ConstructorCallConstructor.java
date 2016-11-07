/*
 * @author FluegLau
 */

class Dog {
    String name;
    Dog() {
        System.out.println("I'm the default dog");
    }

    Dog(String n) {
        this();  // call another constructor in this way.
        // ! this(2); cannot call other constructor twice.
        name = n;
        System.out.println("I have a name:" + name);
    }

    Dog(int n) {
        this("loveDog");
        //! Dog("loveDog"); cannot call in this way
        System.out.println("I love Dog:" + n+"");
    }
}

public class ConstructorCallConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog(1);
    }
}
