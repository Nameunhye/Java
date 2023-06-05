package ex05;

public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();

        b.weith = 20;
        b.height = 20;
        b.lenght = 30;

        System.out.println("상자의 가로, 세로, 높이는 " + b.weith + ", " + b.height + ", " + b.lenght + "입니다.");
        System.out.println("상자의 부피는 " + b.volume() + "입니다.");
        // 이미 식이 BOX class에 존재하기 때문에 값만 설정해주면 된다.
    }
}
