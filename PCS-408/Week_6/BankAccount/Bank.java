package BankAccount;

public class Bank {
    private String name;
    private String address;
    private int balance;
    private int accountNumber;
    private static int i = 0;

    public Bank() {
        balance = 0;
        i++;
        setAccountNumber();
    }

    public void setAccountNumber() {
        accountNumber = 100_000_000 + i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void deposit(int amt) {
        balance += amt;
        System.out.println("Transaction completed successfully.");
    }

    public void withdraw(int amt) {
        if (balance <= 0 || amt > balance)
            System.out.println("Low balance...");
        else {
            balance -= amt;
            System.out.println("Transaction completed successfully.");
        }
    }

    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Address: " + address);
    }
}
