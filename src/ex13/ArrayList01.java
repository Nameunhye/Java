package ex13;

import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList<>();
        // <>안에 적용시킬 class 명을 입력 후 new를 통해 호출한다.

        list.add(new Point(0, 0));
        list.add(new Point(4, 0));
        list.add(new Point(3, 5));
        list.add(new Point(-1, 3));
        list.add(new Point(13, 2));

        System.out.println(list);

    }
}
