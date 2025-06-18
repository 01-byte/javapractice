package IFCase;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //above 100 - Invalid Grade
        //98 - 100 - With Highest honors
        //95 -97.99 - with High honors
        //90 -94.99 - with Honors
        //75 - 89.99 - Passed
        //Below 75 - Failed
        Scanner scan = new Scanner(System.in);

        float englishGrade;
        float mathGrade;
        float scienceGrade;
        float computerGrade;
        System.out.print("Enter English Grade : ");
        englishGrade = scan.nextFloat();
        System.out.print("Enter Math Grade : ");
        mathGrade = scan.nextFloat();
        System.out.print("Enter Science Grade : ");
        scienceGrade = scan.nextFloat();
        System.out.print("Enter English Grade : ");
        computerGrade = scan.nextFloat();


        float average = (englishGrade + mathGrade + scienceGrade + computerGrade) / 4;
        System.out.println("Average is " + average);
        String close = "close";


    if (average > 100 ) System.out.println( "Invalid Grade");
        else if (average >= 98 && average <= 100) System.out.println("With Highest Honors");
        else if (average >=95 && average <= 97.99) System.out.println("With High Honors");
        else if (average >=90 && average <=94.99) System.out.println("With Honors");
        else if (average >=75 && average <=89.99) System.out.println("Passed");
        else System.out.println("Failed");

        System.out.println("Close ko na ba ? ");
        close = scan.nextLine();
        if (close.equalsIgnoreCase("close")) System.out.println("edi close");
        else System.out.println("close ko na wala ka naman gagaawin");

    }
}
