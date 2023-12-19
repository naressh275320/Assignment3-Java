/* Create a application where user has to enter a password and check whether the entered password is strong or not.
Condition for a strong password:
Minimum 2 upper case alphabets
Minimum 2 lower case alphabets
Minimum 2 digits
Minimum 2 special characters
 */

//initializing package
package Question2;

//importing CheckPwd class to main file
import Question2.*;

//importing scanner function 
import java.util.Scanner;

public class StrongPwd {
    public static void main(String[] args){
        //Scanner definition
        Scanner s = new Scanner(System.in);
        char c = 'Y';
        int k;

        //Do-While loop is used to get the password again when a week password is enetered
        do{
            System.out.print("Enter the password: ");
            String pwd = s.next();
            
            //Password string is converted into a character array
            char pwd_arr[] = pwd.toCharArray();
            int n = pwd.length();

            CheckPwd cp = new CheckPwd();
            k = cp.Checking(pwd_arr, n);
            
            //Checking condition whether the entered password is strong or weak
            if(k == 1){
                System.out.println("You have created a strong password!");
                c = 'n';
            }
            else{
                System.out.println("You have entered a week password :(");
                System.out.print("Do you want to enter the password again?(y/n): ");
                c = s.next().charAt(0);
            }
        }while(c == 'y');
    }
}
