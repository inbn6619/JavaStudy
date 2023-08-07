package java_study.chapter06.sec04;

public class AccountUse {
    public static void main(String[] args) {
        Account dad = new Account();
        dad.name = "홍길동";
        dad.accountName = "튼튼적금";
        dad.balance = 1000;

        dad.deposit(1000);
        dad.deposit(1000);
        dad.deposit(1000);
        dad.deposit(1000);
        dad.withdraw(3000);
        dad.withdraw(20000);
    }
}
