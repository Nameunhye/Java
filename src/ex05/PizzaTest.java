package ex05;

class Pizza {
    int size;
    String type;

    public Pizza() {
        size = 10;
        type = "포테이토 피자";
    }

}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza n1 = new Pizza();
        System.out.println(n1.size + n1.type);

    }

}
