package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.Scanner;

/** 
* @author 12S23018 Early Sembiring
* @author 12S23032 Seprian Siagian
*/

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String command = scanner.nextLine(); 
        if (command.equals("create-transaction")) {
            String accountName = scanner.nextLine();    
            double amount = Double.parseDouble(scanner.nextLine());  
            String postedAt = scanner.nextLine();         
            String note = scanner.nextLine();             
        
            Account account = new Account("Unknown", accountName);
            
            
            account.updateBalance(amount);
            
            Transaction transaction = new Transaction(accountName, amount, postedAt, note);
           
            System.out.println(transaction.toString(account));
        }
        
        scanner.close();
    }
}
