import java.util.ArrayList;
public class Array_list_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.remove("A");

        for (int i=0; i< list.size();i++){
            int j =0;
            if (list.get(i)=="A");
            j++;
            if(j==2){
             list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
