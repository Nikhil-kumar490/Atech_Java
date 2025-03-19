import java.util.ArrayList;

public class Array_list_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add(1,"Orange");
        list.add(0,"Licthi");
        list.add(4,"D");
        list.add(1,"Guava");
        list.add(0,"C");
        list.add(2,"E");
        list.add(1,"B");
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
