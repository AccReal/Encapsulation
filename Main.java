public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);  // Неправильная операция
    }
}
