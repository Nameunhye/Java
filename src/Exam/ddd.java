package exam;

public class ddd {
    int radius;

    public ddd(int radius) {
        this.radius = radius;
    }

    public ddd() {
        this(0);
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

}
