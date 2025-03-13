package rocks.zipcode;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    private  String accountNumber;
    private  String ownerName;
    private Double balance;

    // TODO: Implement this class to make the tests pass

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;


        // Your implementation here
    }

    public String getAccountNumber() {
        // Your implementation here
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        // Your implementation here
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        // Your implementation here
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws IllegalAccessException {
        // Your implementation here
            balance += amount;
        }

        public void withdraw( double amount) {
            // Your implementation here
        }
    }






