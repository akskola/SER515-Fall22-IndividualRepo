import java.io.FileInputStream;
import java.util.Scanner;

public class Login {
    int userType;
    String userName;
    String password;

    public void getCredentials(){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the UserName: ");
        userName = myObj.nextLine();

        System.out.println(("Enter password: "));
        password = myObj.nextLine();
    }

    public boolean validateCredentials(){
        try{
            FileInputStream file1 = new FileInputStream("textFiles/BuyerInfo.txt");
            Scanner sc1 = new Scanner(file1);
            while(sc1.hasNextLine())
            {
                String line = sc1.nextLine();
                String[] arr = line.split(":",2);
                if(userName.equals(arr[0]) && password.equals(arr[1])){
                    userType = 0;
                    System.out.println("\nBuyer Log In Successful");
                    System.out.println("\n~~~~~ BRIDGE IMPLEMENTED ~~~~~\n");
                    return true;
                }
            }
            sc1.close();

            FileInputStream file2 = new FileInputStream("textFiles/SellerInfo.txt");
            Scanner sc2 = new Scanner(file2);
            while(sc2.hasNextLine())
            {
                String line = sc2.nextLine();
                String[] arr = line.split(":",2);
                if(userName.equals(arr[0]) && password.equals(arr[1])){
                    userType = 1;
                    System.out.println("Seller Log In Successful");
                    System.out.println("\n~~~~~ BRIDGE IMPLEMENTED ~~~~~\n");
                    return true;
                }
            }
            sc2.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return loginFailed();
    }

    private boolean loginFailed(){
        System.out.println("Login Failed. Invalid Credentials");
        return false;
    }
}
