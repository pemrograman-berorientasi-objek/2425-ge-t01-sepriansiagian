package fintech.model;

/** 
* @author 12S23018 Early Sembiring
* @author 12S23032 Seprian Siagian
*/

public class Account {
    private String owner;
    private String accountName;
    private double balance;
    
    
    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
    }
    
    public String getOwner() {return owner;}
    
    public String getAccountName() {return accountName;}

    public double getBalance() {return balance;}
    
    public void updateBalance(double amount) {this.balance += amount;}
    
    
    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}
