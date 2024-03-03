import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[]cities = {"boston","Dallas","new York"};
        List<String> list = new ArrayList<>(Arrays.asList(cities));
        list.add("san Franxesco");
        list.add("San joe");
        for(String i:list){
            System.out.println(i);
        }
        Collections.addAll(list,cities);
    }
}
