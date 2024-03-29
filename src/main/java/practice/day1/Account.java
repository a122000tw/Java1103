package practice.day1;

public class Account {

    private String name; // 帳戶名
    private int balance; // 帳戶餘額

    boolean hasName() { // 有設定帳戶名嗎?
        return name != null ? true : false;
    }

    void setName(String name) {
        if (name == null) { // 判斷 name 是否空值?
            System.out.printf("帳戶名稱不可是空值: %s\n", name);
        } else {
            name = name.trim(); //去除左右空白
            if (name.length() >= 1 && name.length() <= 10) {
                this.name = name;
            } else {
                System.out.printf("帳戶名稱輸入錯誤: %s\n", name);
            }
        }
    }
    void deposit(int money) { // 存款
        if(!hasName()) {
            System.out.printf("帳戶名不存在無法存款~");
            return; // 離開此方法  
        }
        if(money > 0) {
            System.out.printf("存款金額: %d\n", money);
            balance += money;
        } else {
            System.out.printf("存款金額錯誤: %d\n", money);
        }
        print();
    }

    

    void withdraw(int money) { // 提款
        if (!hasName()) {
            System.out.printf("帳戶名不存在無法提款~");
            return; // 離開此方法
        }
        if (money > 0) {
            System.out.printf("提款金額: %d\n", money);
            if (balance >= money) {
                balance -= money;
            } else {
                System.out.printf("帳戶餘額不足\n");
            }

        } else {
            System.out.printf("提款金額錯誤: %d\n", money);
        }
        print();
    }

    void print() { // 印出帳戶資料
        if (!hasName()) {
            System.out.printf("帳戶名不存在無法印出帳戶資訊~");
            return;
        }
        System.out.printf("%s 帳戶餘額: $%,d\n", name, balance);
    }

}
