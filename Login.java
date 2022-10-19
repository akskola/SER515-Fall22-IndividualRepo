import java.util.Objects;
import java.util.Scanner;

public class Login {
    int userType;
    String userName;
    String password;

    public void getCredentials(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the UserType(0 for Buyer, 1 for Seller): ");
        userType = myObj.nextInt();

        myObj.nextLine(); // To consume the \n character

        System.out.println("Enter the UserName: ");
        userName = myObj.nextLine();

        System.out.println(("Enter password: "));
        password = myObj.nextLine();
    }

    public boolean validateCredentials(){
        if(userType == 1 && ((userName.equals("pepe")) && password.equals("3333"))){
            return loginPassed();
        } else if (userType == 0 && ((userName.equals("tutu")  && password.equals("1111") ) || (userName.equals("mimi") || password.equals("2222") ) || (userName.equals("nana")  || password.equals("3333")))) {
            return loginPassed();
        }

        return loginFailed();
    }

    private boolean loginPassed(){
        System.out.println("Login Successful");
        return true;
    }

    private boolean loginFailed(){
        System.out.println("Login Failed. Invalid Credentials");
        return false;
    }
}
