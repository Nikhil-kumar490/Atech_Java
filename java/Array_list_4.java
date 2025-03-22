import java.util.ArrayList;
public class Array_list_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("A");
        list.remove("A");

// for Size
        int j =0;
        for (int i=0; i< list.size();i++){
            if (list.get(i)=="A"){
            j++;
            if(j==3){
             list.remove(i);
                }
            }
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
