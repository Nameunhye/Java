package ex16;

public class DeadLock {
    public static void main(String[] args) {
        final String res1 = "Gold";
        final String res2 = "Silver";

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread1 : 자원 1 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                synchronized (res2) {
                    System.out.println("Thread1 : 자원 2 획득");
                }

            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println("Thread2 : 자원 1 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                synchronized (res1) {
                    System.out.println("Thread2 : 자원 2 획득");
                }

            }
        });

        t1.start();
        t2.start();

        // Thread t1과 t2의 메소드 진행 순서가 다르면, 교착상태가 생겨 에러가 발생할 수 있지만 메소드 진행 순서가 똑같다면 교착상태에
        // 빠지지 않는다.
    }
}
