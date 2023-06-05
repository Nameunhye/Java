package ex05;

public class DeskLamp {
    boolean ison;

    void turnOn() {
        ison = true;
    }

    void turnOff() {
        ison = false;
    }

    String print() {
        return "현재 상태는 " + (ison == true ? "켜짐" : "꺼짐");
    }
}
