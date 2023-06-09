package mine;

class Car {
    String color;
    int gear;
    int speed;
    // int gasoline;
    // int mileage;
    int toGo;

    @Override
    public String toString() {
        return "Car[color=" + color + ", speed=" + speed + "km/h, gear=" + gear + ", toGo=" + toGo + "]";
    }

    void changeColor(String c) {
        color = c;
    }

    void changeGear(int g) {
        gear = g;
    }

    void speedUp(int speed) {
        speed = speed + 20;
    }

    void speedDown(int s) {
        speed = s - 20;
    }

    void fuelEfficiency(int gasoline, int mileage) {
        toGo = gasoline * mileage;
    }
}

public class Stydy03 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.changeGear(2);
        myCar.fuelEfficiency(10, 10);
        myCar.changeColor("black");
        myCar.speedUp(60);
        System.out.println(myCar);
    }
}
