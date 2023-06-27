package ex16;

class Printer {
    synchronized void print(int[] arr) {
        /**
         * synchronized
         * 
         * 공유 데이터를 조작하는 메소드 앞에
         * 
         * 스레드를 동기화 하여, 코드 순서대로 진행되도록 하는 키워드
         * 코드가 먼저 작성해 있는 스레드가 먼저 실행이 되고, 실행이 종료가 되면
         * 다음 스레드가 실행이 된다.
         * 
         * 이로써
         * 1. 스레드 간섭 문제가 해결된다.
         * 2. 동기화된 메소드가 종료되면 자동적으로 이후의 메소드 호출은 변경된 상태만을 볼 수 있어 메모리 불일치 오류 문제를 해결한다.
         * (다른 스레드가 진행되는 동안 해당 임계영역에 진입할 수 없어 메모리가 일관적으로 유지된다.)
         * 
         * 자바 코드에서 동기화 영역은 synchronizred 키워드로 표시된다. 동기화는 객체에 대한 동기화로 이루어지는데(synchronized
         * on some object), 같은 객체에 대한 모든 동기화 블록은 한 시점에 오직 한 쓰레드만이 블록 안으로 접근하도록 - 실행하도록 -
         * 한다. 블록에 접근을 시도하는 다른 쓰레드들은 블록 안의 쓰레드가 실행을 마치고 블록을 벗어날 때까지 블록(blocked) 상태가 된다.
         * 
         * 동기화된 메소드는 여러 스레드가 동시에 실행될 때, 해당 메소드의 동기화 블록에 대한 상호 배제를 제공하여 메모리 일관성 문제를 해결하는
         * 데 도움을 줍니다.
         * 
         * 동기화된 메소드가 종료되면 해당 메소드가 가진 잠금(lock)이 해제되며, 다른 스레드가 이후에 해당 메소드를 호출할 수 있습니다. 다른
         * 스레드가 동기화된 메소드를 호출하면, 그 스레드는 메소드의 동기화 블록에 진입하기 전에 해당 메소드의 잠금을 획득해야 합니다. 이를 통해
         * 한 번에 하나의 스레드만이 동기화된 메소드를 실행할 수 있습니다.
         * 
         * 동기화된 메소드의 주요 목적은 임계 영역(critical section)에 대한 동시 접근을 제어하여 메모리 일관성 문제를 해결하는
         * 것입니다. 임계 영역은 여러 스레드가 동시에 접근하면 문제가 발생할 수 있는 공유 데이터나 공유 자원을 사용하는 코드 영역을 의미합니다.
         * 
         * 동기화된 메소드를 사용하면 한 스레드가 임계 영역에 진입하여 작업을 수행하는 동안 다른 스레드는 해당 임계 영역에 접근할 수 없습니다.
         * 이를 통해 데이터의 일관성과 정확성을 유지하며, 메모리 일관성 문제를 해결할 수 있습니다.
         * 
         * 단, 동기화된 메소드는 잠금과 잠금 해제에 대한 오버헤드가 발생할 수 있으므로, 필요한 경우에만 사용하는 것이 좋습니다. 또한, 동기화된
         * 메소드를 사용할 때는 잠금 범위를 최소화하여 성능을 향상시키는 것이 중요합니다.
         */
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

    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(Printer prn) {
        this.prn = prn;
    }

    public void run() {
        prn.print(myarr);
    }
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
}

public class SynchroPo {
    public static void main(String[] args) {

        Printer obj = new Printer();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }

}
