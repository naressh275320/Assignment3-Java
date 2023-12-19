/* Create a bank application 
•	Where user get deposit their amount.
•	Withdraw their amount.
•	Three type of account they can chose.  (Saving, current, demat)
•	Make a separate section for F.D where user can deposit money for fix time period.
•	Use oops concept for creating this application.
•	You must show the current balance for user. When he performed deposit and withdraw.
 */

package Question1;
import Question1.*;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        //Scanner definition
        Scanner scanner = new Scanner(System.in);
        
        //Creating a reference object to access bank details class
        BankDetails userAccount = new BankDetails();
        FixedDeposit fixedDeposit = new FixedDeposit();
        char ch = 'Y';

        //Do-While loop to use the bank application till exit option is selected
        do{
            System.out.println();
            System.out.println("*******************Welcome to Deluxe Bank application!*******************");
            System.out.print("Enter the number for selecting the desired option \n1) To entering the account details \n2) To view the account details \n3) To deposit money \n4) To withdraw money \n5) To open a fixed deposit \n6) Exit: ");
            int c = scanner.nextInt();
            
            //Switch case is used to access the desired method based on the option selected in input by the user
            switch (c) {
                case 1:
                    userAccount.accountdetails();
                    userAccount.deposit();
                    break;
            
                case 2:
                    userAccount.show();
                    break;

                case 3:
                    userAccount.deposit();
                    userAccount.displayBalance();
                    break;

                case 4:
                    userAccount.withdraw();
                    userAccount.displayBalance();
                    break;

                case 5:
                    fixedDeposit.openFixedDeposit();
                    break;

                case 6:
                    ch = 'N';
                    break;
        
                default:
                    System.out.println("Wrong option");
                    break;
            }
            if(ch != 'N'){
                System.out.println("Do you want to go to main menu?(Y/N): ");
                ch = scanner.next().charAt(0);
            }
        }while(ch == 'Y');
        System.out.println("Thank you and visit again!!");
    }
}
