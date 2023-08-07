package java_study.chapter06.sec04;

public class Block {
    int x = 10;
    int y = 10;
    String color = null;

    public void stack() {
        int move = 50;
        System.out.println(move + "만큼 벽돌을 쌓다.");

    }

    public String toString() {
        return "Block [x=" + x + ", y= " + y + ", color=" + color + "]";
    }
}
