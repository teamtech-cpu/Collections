import java.util.ArrayList;
import java.util.List;

public class ConverListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Guva");
        System.out.println("Fruits List"+ list);
        //converting list to Array
        String[] str = new String[list.size()];
        for(int i=0;i<list.size();i++){
            str[i]=list.get(i);
        }
        for(String i:str){
            System.out.println(i.toLowerCase());
        }
    }
}
