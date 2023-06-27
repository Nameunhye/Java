package ex16;

class Printer {
    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread1 extends Thread {
    Printer prn;
    // Printer 클래스의 참조변수(인스턴스 변수) prn을 통해 Printer 클래스의 객체를 사용할 수 있다.

    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(Printer prn) {
        this.prn = prn;
    }
    // 생성자
    // MyThread1 클래스의 생성자인 MyThread1(Printer prn)에서 prn은 매개변수로 전달된 Printer 객체를 받는
    // 역할을 합니다. 매개변수는 Printer의 참조변수 obj로, MyThread1 객체를 생성할 때 해당 생성자에 Printer 객체를
    // 전달해야 합니다.

    public void run() {
        prn.print(myarr);
    }
    // prn을 통해 Printer class의 print()를 실행하는 것
}

class MyThread2 extends Thread {
    Printer prn;
    int[] myarr = { 1, 2, 3, 4, 5 };

    MyThread2(Printer prn) {
        this.prn = prn;
    }

    public void run() {
        prn.print(myarr);
    }
    // Thread 객체 메소드
}

public class Synchron {
    public static void main(String[] args) {

        Printer obj = new Printer();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
        // Thread 실행 메소드
    }

}
