public class Bank {
    static int currentBalance = 1000;

    public static void greetcustomer() {
        System.out.println("Hello, wrelcome ot banking aplication");
    }

    public void deposit(int amount) {
        currentBalance = currentBalance + amount;
        System.out.println("amount depodited succesfully");
    }

    public static void withdrawn(int amount) {
        currentBalance = currentBalance - amount;
        System.out.println("amount withdrawn succesfully");
    }

    public static int getcurrentBalance() {
        return currentBalance;
    }

    public static void main(String args[]) {
        Bank bank = new Bank();
        greetcustomer();
        System.out.println("current balance is:" + getcurrentBalance());
        bank.deposit(500);
        System.out.println("current balance is:" + getcurrentBalance());
        withdrawn(300);
        System.out.println("current balance is:" + getcurrentBalance());
        System.gc();
        
    }
}
