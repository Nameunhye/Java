package ex13;

import java.util.ArrayList;

public class ArrayList03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // <> 안에 저장할 타입인 String을 입력한다.
        // <> 안에 아무것도 작성하지 않으면, Object 타입으로 저장되며
        // ArrayList list = new ArrayList();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pear");
        list.add("Grape");

        int index = list.indexOf("Mango");
        System.out.println("Mango의 위치 : " + index);
        System.out.println(list.size());
    }
}