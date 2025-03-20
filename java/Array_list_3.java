
    import java.sql.SQLOutput;
import java.util.ArrayList;

public class Array_list_3 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("A");
            list.add(0,"E");
            list.add("B");
            list.remove(1);
            list.add("c");
            list.add(1,"D");
            list.remove(3);

            //for Replace the elmt
            list.set(2,"H");

            list.add("F");
            list.add(3,"G");

            System.out.println(list);
        }
    }


