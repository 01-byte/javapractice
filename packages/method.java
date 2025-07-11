package packages;

public class method {
    public static void main(String[] args) {
        method h = new method();
        System.out.println(h.adding(1,2));
        sayHello();
        h.adding(1,3);
        h.adding(1, 3,7);
        int [] array = {1,2,3};
        summation(array);

    }   

        static void sayHello(){
            System.out.println("Hello");
        }

        int adding(int a , int b){
            int sum = a + b;
            System.out.println(sum);
            return sum;
        }

        void adding(int a , int b ,int c ){
            System.out.println(a + b + c);
        }

        static void summation (int[] numbers){
            
            int sum = 0 ;
            for(int number : numbers){
                 sum += number ;
                 
            }
                System.out.println("sum is " + sum);
        }



}



