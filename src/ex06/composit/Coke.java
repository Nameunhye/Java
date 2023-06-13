package ex06.composit;

//composit
public class Coke {
    private int price;
    private String decs;

    public Coke() {
        this(500, "콜라");
    }

    public Coke(int price, String decs) {
        this.price = price;
        this.decs = decs;
    }

    public int getPrice() {
        return price;
    }

    public String getDecs() {
        return decs;
    }

}
