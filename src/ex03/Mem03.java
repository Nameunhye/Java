package ex03;

import java.util.*;

public class Mem03{
    public static void main(String[] args) {
        String address;
        int housenumber;

        Scanner a = new Scanner(System.in);

        System.out.println("주소를 입력하시오: ");
        address = a.nextLine();
        System.out.println("번지 수를 입력하시오: ");
        housenumber = a.nextInt();

        System.out.println(address + " " + housenumber + "번지에 거주하고 계시군요");


    }
    
}
