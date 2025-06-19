package Constructor;

public class constructor {
    public static void main(String[] args) {
        computerParts easypc = new computerParts();
        easypc.numParts = 1;
        easypc.brandName = "AMD";
        computerParts bulok = new computerParts();
        System.out.println();
    }
}

class computerParts{
     int numParts = 0;
     String brandName;
     public computerParts(){
       brandName = "Intel"; 
}
}


class Name {
    String firstname = "wew";
    String lastname = "gamers";
    String full = firstname + lastname;
    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.firstname = "Awow";
        name1.lastname = "WOWOW";
        System.out.println(name1.firstname);
        System.out.println(name1.lastname);
        System.out.println(name1.full);
    }

}