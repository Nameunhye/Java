package ex05;

public class Televison {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
        Televison myTv = new Televison();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.onOff = true;
        System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다");

        Televison YouTv = new Televison();
        YouTv.channel = 9;
        YouTv.volume = 12;
        YouTv.onOff = false;
        System.out.println("너의 텔레비전의 채널은 " + YouTv.channel + "이고 볼륨은 " + YouTv.volume + "입니다.");
    }
}
