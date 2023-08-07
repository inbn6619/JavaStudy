package java_study.chapter06.sec04;

public class Account {

    String name;
    String accountName;
    int balance;

    public void deposit(int amount) {
        balance += amount;
        System.out.println(name + "이" + amount + "원을 입금하다.");
    }

    public void withdraw() {
        System.out.println(name + "이" + accountName + "에서 출금하다.");
    }

}
