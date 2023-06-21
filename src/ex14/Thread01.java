package ex14;

public class Thread01 {

    // CPU가 하나의 스레드를 생성하여 실행한다.(JVM이 할당)
    // 실 == main 메소드
    // main메소드(body없는)는 실이 존재하지 않고, body가 생기면 존재해진다.
    // 실의 길이는 main메소드의 body(스레드의 길) 길이에 따라 달라진다.
    public static void main(String[] args) { // 1. main 스레드 시작

        // 새로운 스레드 생성 : {}부분 - 스레드의 길
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("서브 스레드 : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 3. 내부 실행(3-4 왔다갔다왔다갔다)

        }).start(); // 2. start 기점에서 {}내부 시작

        // 메인 스레드
        // 4. 내부 실행(3-4 왔다갔다왔다갔다)
        for (int i = 0; i < 5; i++) {
            System.out.println("메인 스레드 : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
// 만약 메인 스레드가 먼저 시작, 새로운 스레드가 나중에 시작이라면