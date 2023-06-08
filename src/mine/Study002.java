package mine;

import ex05.BoxTest;

abstract class Boxes {
    abstract String name();

    abstract int price();

    abstract int n();

    void total(int price) {
    }
}

class Box1 extends Boxes {
    String name;
    int price;
    int n;

    public Box1(String name, int price, int n) {
        this.name = name;
        this.price = price;
        this.n = n;
    }

    @Override
    int n() {
        return n;
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int price() {
        return price;
    }

    @Override
    void total(int price) {
        this.price = price;
    }

}

class Box2 extends Boxes {
    String name;
    int price;
    int n;

    public Box2(String name, int price, int n) {
        this.name = name;
        this.price = price;
        this.n = n;
    }

    @Override
    int n() {
        return n;
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int price() {
        return price;
    }

    @Override
    void total(int price) {
        this.price = price;
    }

}

class Box3 extends Boxes {
    String name;
    int price;
    int n;

    public Box3(String name, int price, int n) {
        this.name = name;
        this.price = price;
        this.n = n;
    }

    @Override
    int n() {
        return n;
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int price() {
        return price;
    }

    @Override
    void total(int price) {
        this.price = price;
    }

}

public class Study002 {

    static void Calculate(Boxes a, Boxes b) {
        String sell;
        int revenue = 0;
        a.total(a.price() * a.n());
        b.total(b.price() * b.n());
        sell = (a.n() > b.n()) ? a.name() : b.name();
        revenue = (a.price() > b.price()) ? a.price() : b.price();
        System.out.println(a.name() + "은 " + a.n() + "개가 팔렸고, 총 " + a.price() + "원을 벌었다.");
        System.out.println(b.name() + "은 " + b.n() + "개가 팔렸고, 총 " + b.price() + "원을 벌었다.");
        System.out.println("판매 갯수는 " + sell + "가 더 팔렸다.");
        System.out.println("오늘의 수입이 더 많은 쪽은 " + revenue + "원 이다.....");

    }

    public static void main(String[] args) {
        Boxes a1 = new Box1("red box", 1000, 15);
        Boxes b1 = new Box2("blue box", 800, 10);
        Boxes c1 = new Box3("black box", 1500, 1);

        Calculate(c1, a1);
    }
}
