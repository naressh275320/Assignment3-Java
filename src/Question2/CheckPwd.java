/* Create a application where user has to enter a password and check whether the entered password is strong or not.
Condition for a strong password:
Minimum 2 upper case alphabets
Minimum 2 lower case alphabets
Minimum 2 digits
Minimum 2 special characters
 */

//initializing package
package Question2;

class CheckPwd{
    //Declaring instance variable for counting purpose to check whether the given input is strong or not
    int lower_case = 0, upper_case = 0, digits = 0, special_characters = 0;
    
    int Checking(char password_arr[], int n){

        //Each character is picked with for loop to check the type of character
        for(int i=0; i<n; i++){
                
            //Checking whether the character is lower case alphabet
            if(Character.isLowerCase(password_arr[i])){
                lower_case += 1;
            }

            //Checking whether the character is upper case alphabet
            else if(Character.isUpperCase(password_arr[i])){
                upper_case += 1;
            }

            //Checking whether the character is digit
            else if(Character.isDigit(password_arr[i])){
                digits += 1;
            }

            //Checking whether the character is special characters
            else{
                special_characters += 1;
            }
        }

        if((lower_case  >= 2 && upper_case >=2) && (digits >= 2 && special_characters >= 2)){
            return 1;
        }
        return 0;
    }
}