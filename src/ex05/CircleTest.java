package ex05;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        obj1.radius = 100;
        obj1.color = "red";

        double area1 = obj1.geaArea();
        System.out.println("첫 번째 원의 면적은 : " + area1);

        Circle obj2 = new Circle();
        obj2.radius = 200;
        obj2.color = "blue";

        double area2 = obj2.geaArea();
        System.out.println("두 번째 원의 면적은 : " + area2);

    }
}
