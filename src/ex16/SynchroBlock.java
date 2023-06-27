package ex16;
// 해당코드 이상...........

// synchronized (this)는 인스턴스 메소드 내에서 사용되는 동기화 구조입니다. 이 구조는 특정 객체의 인스턴스에 대한 동기화를 제공합니다.

// synchronized (this) 구문은 현재 실행 중인 메소드를 호출한 객체의 인스턴스를 잠금(lock)으로 사용합니다. 이를 통해 동기화된 블록 내에서 해당 객체의 인스턴스 변수나 메소드에 대한 접근이 동기화됩니다. 다른 스레드가 동일한 객체의 동기화된 메소드를 호출하려고 할 경우, 해당 스레드는 잠금이 해제될 때까지 대기하게 됩니다.
class Printer {
    synchronized void print(int[] arr) throws Exception {
        synchronized (this) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("출력이 완료 되었습니다.");
    }
}

class MyThread1 extends Thread {
    Printer prn;

    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(Printer prn) {
        this.prn = prn;
    }

    public void run() {
        try {
            prn.print(myarr);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread {
    Printer prn;
    int[] myarr = { 1, 2, 3, 4, 5 };

    MyThread2(Printer prn) {
        this.prn = prn;
    }

    public void run() {
        try {
            prn.print(myarr);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class SynchroBlock {
    public static void main(String[] args) {

        Printer obj = new Printer();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }

}
