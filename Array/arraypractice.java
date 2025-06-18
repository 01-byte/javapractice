package Array;
import java.util.Scanner;
public class arraypractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username[] = new String[5];
        String email[] = new String[5];
        String password[] = new String[5];

       // User 1
        System.out.println("Enter username 1 Credentials ");
        System.out.print("Enter username 1 Username: ");
        username[0] = scan.nextLine();
        System.out.print("Enter username 1 Email: ");
        email[0] = scan.nextLine();
        System.out.print("Enter username 1 Password: ");
        password[0] = scan.nextLine();
        //User 2
        System.out.println("Enter username 2 Credentials ");

        System.out.print("Enter username 2 Username: ");
        username[1] = scan.nextLine();
        System.out.print("Enter username 2 Email: ");
        email[1] = scan.nextLine();
        System.out.print("Enter username 2 Password: ");
        password[1] = scan.nextLine();
        //User3

        System.out.println("Enter username 3 Credentials ");

        System.out.print("Enter username 3 Username: ");
        username[2] = scan.nextLine();
        System.out.print("Enter username 3 Email: ");
        email[2] = scan.nextLine();
        System.out.print("Enter username 3 Password: ");
        password[2] = scan.nextLine();
        //User4
        System.out.println("Enter username 4 Credentials ");

        System.out.print("Enter username 4 Username: ");
        username[3] = scan.nextLine();
        System.out.print("Enter username 4 Email: ");
        email[3] = scan.nextLine();
        System.out.print("Enter username 4 Password: ");
        password[3] = scan.nextLine();
        //User5
        System.out.println("Enter username 5 Credentials ");

        System.out.print("Enter username 5 Username: ");
        username[4] = scan.nextLine();
        System.out.print("Enter username 5 Email: ");
        email[4] = scan.nextLine();
        System.out.print("Enter username 5 Password: ");
        password[4] = scan.nextLine();


        int selectnum;
        System.out.println("Select User : ");
        selectnum = scan.nextInt();

        if (selectnum == 1){
            System.out.println("Username is :" + username[0]);
            System.out.println("Email  is :" + email[0]);
            System.out.println("Password is :" + password[0]);
        }
        else if (selectnum == 2){
            System.out.println("Username is :" + username[1]);
            System.out.println("Email  is :" + email[1]);
            System.out.println("Password is :" + password[1]);
        }
        else if (selectnum == 3){
            System.out.println("Username is :" + username[2]);
            System.out.println("Email  is :" + email[2]);
            System.out.println("Password is :" + password[2]);
        }
        else if (selectnum == 4){
            System.out.println("Username is :" + username[3]);
            System.out.println("Email  is :" + email[3]);
            System.out.println("Password is :" + password[3]);
        }
        else if (selectnum == 5){
            System.out.println("Username is :" + username[4]);
            System.out.println("Email  is :" + email[4]);
            System.out.println("Password is :" + password[4]);
        }
        else {
            System.out.println("Please input 1-5 only");
        }
    }
}
