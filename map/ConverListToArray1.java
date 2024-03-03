import java.util.ArrayList;
import java.util.List;

public class ConverListToArray1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Guva");
        System.out.println("Fruits List"+ list);

     //   String [] str = list.toArray(new String[0]);
        String [] str = list.toArray(new String[list.size()]);
        for(String i : str){
            System.out.println(i);
        }
    }
}
