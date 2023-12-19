/* Create a bank application 
•	Where user get deposit their amount.
•	Withdraw their amount.
•	Three type of account they can chose.  (Saving, current, demat)
•	Make a separate section for F.D where user can deposit money for fix time period.
•	Use oops concept for creating this application.
•	You must show the current balance for user. When he performed deposit and withdraw.
 */

 package Question1;
import java.util.Scanner;

public class FixedDeposit{

    //Scanner definition
    Scanner scanner = new Scanner(System.in);

    //Method to open a fixed deposit account
    public void openFixedDeposit() {
        System.out.print("Enter F.D. amount: Rs");
        double fdAmount = scanner.nextDouble();
        System.out.print("Enter F.D. duration (in months): ");
        int fdDuration = scanner.nextInt();
        System.out.println("Fixed Deposit opened for Rs" + fdAmount + " for " + fdDuration + " months.");
    }
}
