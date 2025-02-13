public class super_class {
    public static void main(String[] args) {
        B b= new B();
    }
}
class A{
    A(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
//        System.out.println("B");
        super();
    }

}
