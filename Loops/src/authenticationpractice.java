package Loops.src ; 
import java.util.Scanner;

public class authenticationpractice {
public static void main (String [] args ) { 

String [] user = {"Son","wew","gg","ano"};
String [] pass = {"4323", "ano", "wowowo", "wowskie"};

Scanner scan = new Scanner(System.in);

System.out.println("Search user : ");
String searchUser = scan.nextLine();

System.out.println("Input Pass : ");
String passSearch = scan.nextLine();
boolean isCorrect = false ; 

for(int i= 0 ; i < user.length ; i++ ) { 
    if (user[i].equalsIgnoreCase(searchUser) && pass[i].equalsIgnoreCase(passSearch)){
        isCorrect = true; 
        break;
        }
    }
    System.out.println(isCorrect ? "Welcome , " + searchUser: "Account not Found");



}
}