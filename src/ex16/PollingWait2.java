package ex16;

class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized int get() {
        while (empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        empty = true;
        notifyAll();
        return data;
    }

    /**
     * 위의 코드는 get() 메소드의 일부분입니다.
     * 
     * while (empty) : 버퍼가 비어있을 경우를 나타내는 조건입니다. empty 변수가 true인 동안에는 반복문 내부의 코드가
     * 실행됩니다.
     * try { wait(); } : 버퍼가 비어있을 경우에는 wait() 메소드를 호출하여 현재 스레드를 일시적으로 대기 상태로 전환합니다.
     * 이렇게 함으로써 다른 스레드가 put() 메소드를 통해 데이터를 버퍼에 넣을 때까지 기다립니다.
     * empty = true; : wait() 메소드에서 깨어난 후에는 다시 empty 변수를 true로 설정하여 버퍼가 비어있음을 표시합니다.
     * 이는 이미 데이터를 가져왔으므로 버퍼를 비워야 함을 의미합니다.
     * notifyAll() : get() 메소드가 데이터를 가져갔으므로, put() 메소드에서 대기 중인 다른 스레드들에게 데이터의 변경 상태를
     * 알리기 위해 notifyAll() 메소드를 호출합니다. 이렇게 함으로써 대기 중인 스레드 중 하나가 버퍼에 데이터를 넣을 수 있게 됩니다.
     * 즉, 위의 코드는 버퍼가 비어있을 경우에는 대기 상태로 전환하고, 데이터를 가져온 후에는 버퍼를 비웠음을 표시하고 대기 중인 스레드들에게
     * 상태 변경을 알리는 과정을 수행하는 것입니다.
     * 
     * @param data
     */

    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        empty = false;
        this.data = data;
        notifyAll();
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("생산자 :" + i + "번 케이크를 생산하였습니다.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (Exception e) {
            }
        }
    }

}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer drop) {
        this.buffer = drop;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("소비자 :" + data + "번 케이크를 소비하였습니다.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (Exception e) {
            }
        }
    }
}

public class PollingWait2 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        (new Thread(new Producer(buffer))).start();
        (new Thread(new Consumer(buffer))).start();

    }
}
