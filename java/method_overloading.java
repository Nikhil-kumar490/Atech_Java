public class method_overloading {
    public static void main(String[] args) {
         m(5,6);
         m(5.6,9.6);
//         m("hw", "nw");
    }

    public static void m(int a , int b) {
        System.out.println(a+b + "Integer value");

    }
    public static void m(double a, double b) {
        System.out.println(a+b + "Double value");
    }
    public static void m( String a,int b) {
        System.out.println(a+b + " value");
    }
}
