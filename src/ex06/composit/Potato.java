package ex06.composit;

//composit
public class Potato {
    private int price;
    private String decs;

    public Potato() {
        this(800, "포테이토");
    }

    public Potato(int price, String decs) {
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
