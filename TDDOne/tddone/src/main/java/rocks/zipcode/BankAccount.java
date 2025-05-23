

package rocks.zipcode;

/**
 * EXERCISE 2: BankAccount
 * <p>
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    private Integer accountNumber;
    private String ownerName;
    Double balance;

    // TODO: Implement this class to make the tests pass

    public BankAccount(Integer accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;




        // Your implementation here
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) throws IllegalAccessException {
         balance += amount;
      }
     public void withdraw( double amount) throws IllegalAccessException {
           Double withdraw = 40.0;
           if (withdraw < balance) {
                    throw new IllegalAccessException("withdraw must be less than balance");
               } else {  balance-=withdraw; }
   }


}



public String getAccountNumber() {return null ;}
//        // Your implementation here
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getOwnerName() {
//        // Your implementation here
//        return ownerName;
//    }
//
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public double getBalance() {
//        // Your implementation here
//        return balance;
//    }
//
//    public void setBalance(Double balance) {
//        this.balance = balance;
//    }
//
//    public void deposit(double amount) throws IllegalAccessException {
//        // Your implementation here
//            balance += amount;
//        }
//
//        public void withdraw( double amount) throws IllegalAccessException {
//
//            Double withdraw = 0.0;
//            if (withdraw < balance) {
//                    throw new IllegalAccessException("withdraw must be less than balance");
//                } else {  balance-=withdraw; }
//    }
//    }






