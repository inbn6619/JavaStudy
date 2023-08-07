package java_study.chapter07.sec01;

public class Account {

    private String name;
    private String accountName;
    private int balance;

    public Account() {

    }

    public Account(String n, String an, int b) {
        name = n;
        accountName = an;
        balance = b;

    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(name + "이 " + amount + "원을 입금하다.");
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;

        System.out.println(name + "이 " + accountName + "에서 출금하다.");
    }

}
