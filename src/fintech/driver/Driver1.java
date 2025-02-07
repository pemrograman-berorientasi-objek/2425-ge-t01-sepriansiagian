package fintech.driver;

import fintech.model.Account;
import java.util.Scanner;

/** 
* @author 12S23018 Early Sembiring
* @author 12S23032 Seprian Siagian
*/

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        String command = scanner.nextLine();   
        if (command.equals("create-account")) {
            String owner = scanner.nextLine();      
            String accountName = scanner.nextLine();   
            
            Account account = new Account(owner, accountName);
          
            System.out.println(account);
        }
        
        scanner.close();
    }
}
