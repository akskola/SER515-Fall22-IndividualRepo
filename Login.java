import java.util.Scanner;

public class Login {
    int userType;
    String userName;
    String password;
    public Login(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the UserType(0 for Buyer, 1 for Seller): ");
        userType = myObj.nextInt();

        System.out.println("Enter the UserName: ");
        userName = myObj.nextLine();

        System.out.println(("Enter password: "));
        password = myObj.nextLine();
    }

    public void validateCredentials(){
    }
}
