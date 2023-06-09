package mine;

import javax.naming.PartialResultException;

class Television {
    private int channal;
    private int volumn;
    private boolean onOff;

    Television(int c, int v, boolean o) {
        channal = c;
        volumn = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channal + "이고, 볼륨은 " + volumn + "입니다.");
    }

}

public class Study00 {
    public static void main(String[] args) {
        Television myTv = new Television(7, 10, false);
        myTv.print();
        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
