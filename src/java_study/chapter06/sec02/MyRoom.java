package java_study.chapter06.sec02;

// import java_study.chapter06.sec01.Phone;

public class MyRoom {
    public static void main(String[] args) {
        TV myTv = new TV();
        myTv.ch = 100;
        myTv.vol = 50;
        myTv.onOff = true;
        System.out.println(myTv);

        TV yourTv = new TV();
        yourTv.ch = 200;
        yourTv.vol = 60;
        yourTv.onOff = false;
        System.out.println(yourTv);

    }
}
