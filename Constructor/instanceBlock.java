package Constructor;



// instance variable first 
// instance initializer second
// constructor last
public class instanceBlock {
    int code = 1;  // 1st intialized or read
    instanceBlock(){ //3rd intialized constructor
        code = 0 ; 
    }

    {System.out.println(code);} // 2nd intialized
    public static void main(String[] args) {
        instanceBlock initializer = new instanceBlock();
        System.out.println(initializer.code);  // initialized the constructor
        {
            System.out.println("feathers");
        }
    }
    {
        System.out.println("Snowy");
        code = 23223;
        System.out.println("code is " + code);
    }
}
