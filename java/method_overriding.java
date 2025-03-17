public class method_overriding {
    public static void main(String[] args) {
      Dogs d = new Dogs();
      d.sound();

      Animals s = new Animals();
        s.sound();
    }
}
class Animals{
    void sound(){
        System.out.println("Sound");
    }

} class Dogs extends Animals{
    @Override
     void sound(){
         System.out.println("Bhow");
     }
}


