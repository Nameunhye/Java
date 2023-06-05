package ex06.ch03;

class 동물 {
    String print() {
        return "동물";
    }
}

class 사자 extends 동물 {
    String name = "사자";

    String print() {
        return name;
    }
}

class 호랑이 extends 동물 {
    String name = "호랑이";
}

public class Animal {
    public static void main(String[] args) {
        동물 d = new 사자();

        System.out.println();
    }
}