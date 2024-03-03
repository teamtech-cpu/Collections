import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDecendingOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Guva");

        for(String str :list){
            System.out.println(str);
        }
        Collections.sort(list,Collections.reverseOrder());
        for(String s :list){
            System.out.println(s);
        }

        //Collections.sort(list);
        //Collections.reverse(list);
    }
}
