
package practice.day1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Adam");
        account.deposit(100000000);
        account.withdraw(300000);
        account.withdraw(500000);
        account.print();
    }
}
