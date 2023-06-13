package mine;

class Base {
    Base(int x) {
        System.out.println("Base() 생성자");
    }
}

class Derived extends Base {
    Derived() {
        super(100);
        System.out.println("Derived() 생성자");
    }
}

public class Me {
    public static void main(String[] args) {
        Derived r = new Derived();

    }
}
