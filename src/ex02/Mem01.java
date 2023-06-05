package ex02;


class Hello {
    static int price = 20000;
    String name = "커피";

    void run() {
        int n1 = 100;
        // 밑에 d.run();을 뜨지 않는 이유는 , run 안에서 이미 실행되어서 삭제된 파일이기 때문에
        System.out.println("달린다"+ " " +n1);
        // n1 값을 뜨게 하려면, 아예 "달린다"+n1을 해줘야 한다.
    }
}

class Memory {
    int time = 10;
    static String name = "나므네";
}

public class Mem01 {

    static int price = 10000;

    public static void main(String[] args) {
        System.out.println(Mem01.price); 
        System.out.println(Memory.name); // Memory의 name 값은 static에 있기 때문에, 굳이 new를 이용해서 heap에 저장할 필요가 없다.
        
        Memory c = new Memory();
        Hello d = new Hello();
        
        d.run(); // run에서 이미 실행한 내용이 있고, static에 없기 때문에 d.run을 한다
        System.out.println(d.name); // Hello의 name 값은 static에 없기 때문에, new를 이용해서 heap에 저장해서 사용한다. class Hello의 명칭을 d로 해서 저장했기 때문에 d에서 name을 부른다. 
        System.out.println(c.time);
        
        System.out.println(Hello.price);



    }
}