public class Abstraction {
    public static void main(String[] args) {
    CarX x= new CarX();
    x.start();
    }
}
 abstract class Van {
     abstract void start();
 }

 class CarX extends Van{
    @Override
     void start(){
        System.out.println("This is called Abstraction");
    }
 }