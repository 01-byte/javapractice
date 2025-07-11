public class sowns{
public static void main(String[]args){
    String names [] [] = new String [2][3];
    
    String pangalan[][] = {
        {"Son", " wow"},
        {"awow", "Swes"},
        {"wowow", "Sowmdw"}
    };
    System.out.println(pangalan[0][1]);

    // for (int row = 0 ; row < pangalan.length; row ++){

    //     for (int col = 0 ; col < pangalan[row].length; col ++){
    //         System.out.println(pangalan[row][col]);
    //     }
    //     System.out.println();
    // }


    for (String name []: pangalan){

       
        for (String info:name){
            System.out.println(info);
        }
        System.out.println();
    }


}

}