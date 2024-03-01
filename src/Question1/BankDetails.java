/* Create a bank application 
•	Where user get deposit their amount.
•	Withdraw their amount.
•	Three type of account they can chose. (Saving, current, demat)
•	Make a separate section for F.D where user can deposit money for fix time period.
•	Use oops concept for creating this application.
•	You must show the current balance for user. When he performed deposit and withdraw.
 */

package Question1;
import java.util.Scanner;

class BankDetails{
    //Initialization of instance variables chech test
    private double balance;
    private String accountType;
    private String name;
    private String acc_no;

    //Scanner definition
    Scanner scanner = new Scanner(System.in);

    //Constructor to assign null values to the instance variables
    public BankDetails(){
        this.balance = 0;
        this.accountType = null;
        this.acc_no = null;
        this.name = null;
    }

    //Method to open new account 
    public void accountdetails(){
        System.out.print("Enter your Account number: ");
        acc_no= scanner.next();
        System.out.print("Enter your Name: ");
        name = scanner.next();
        System.out.print("Enter your Account type (Saving/Current/Demat): ");
        accountType = scanner.next();
    }

    //Method to display account details
    public void show(){
        System.out.println("Account number: "+ acc_no);
        System.out.println("Name: "+ name);
        System.out.println("Account type: "+ accountType);
        System.out.println("Balance: "+ balance);  
    }

    //Method to deposit money 
    public void deposit() {
        System.out.print("Enter deposit amount: Rs");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Amount Deposited: Rs" + amount);
    }

    //Method to withdraw money 
    public void withdraw() {
        System.out.print("Enter withdrawal amount: Rs");
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("You Withdrew: Rs" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    //Method to display balance amount
    public void displayBalance() {
        System.out.println("Net Available Balance: Rs" + balance);
    }
}
