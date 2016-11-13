// derived class calls base class's constructor
// @author  FluegLau

import static com.liu.flueg.util.Print.*;

class Country {
    Country() {
        print("Born in China");
    }
    Country(String s) {
        print("Born in " + s);
    }
}

class Province extends Country {
    Province() {
        print("live in GD.");
    }
    Province(String s) {
        super("PRC");
        print("live in " + s);
    }
}

class City extends Province {
    City() {
        print("Works in Shenzhen");
    }
    City(String s) {
        super("gd");
        print("Works in " + s);
    }

}

public class SonCallsFatherConstructor {
    public static void main(String[] args) {
        City sz = new City();
        City gz = new City("Guangzhou");
    }
}
