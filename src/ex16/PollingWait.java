package ex16;

import java.util.concurrent.locks.Condition;

//polling

public class PollingWait {

    boolean condition;

    public void badMethod() {
        boolean condition = false;
        while (!condition) {
        }
    }
    // 쭉 종료 없이 true값으로, 무한정 증식하여 CPU 시간을 엄청 낭비한다. 절대 해서는 안된다!

    public synchronized void notifyCondition() {
        condition = true;
        notify();
    }

    public synchronized void goodMethod() {
        condition = false;
        while (!condition) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("조건이 만족되었습니다!");
    }

    public static void main(String[] args) {

    }

}
