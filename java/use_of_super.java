public class use_of_super {
    public static void main(String[] args) {
       Ch c = new Ch();
       c.display();
    }
}
class P{
    int i = 10;
}
class Ch extends P{
   int i = 20;
   void display(){
       System.out.println(super.i);

   }
}