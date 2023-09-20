public class BankAccount {
    private String customerName, email;
    private double balance;
    private int accountNumber, phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int funds) {
        this.balance += funds;
        System.out.println(funds + " added to your account");
    }

    public void withdrawFunds(int funds) {
        if (funds > balance) {
            System.out.println("You don't have enough money in your bank account in order to withdraw");
            return;
        }
        this.balance -= funds;
        System.out.println(funds + " taken from your account");
    }
}
