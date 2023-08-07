package java_study.chapter07.sec02;

public class AccountUse {
    public static void main(String[] args) {
        Account ac1 = new Account("홍길동", "990115", 10000);
        System.out.println(ac1);

        Account ac2 = new Account("고길동", "910115", 100000);
        System.out.println(ac2);
    }
}
