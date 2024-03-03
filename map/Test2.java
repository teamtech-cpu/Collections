import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "a");
        map.put("b", "c");
        for (String key : map.keySet()){
            System.out.println(key + ""+ map.values());
        }
        System.out.println(map.size());
        System.out.println(map.keySet());
        //checking whether map is empty or not
        System.out.println(map.isEmpty());
       // System.out.println(""+(map.size()==0));

    }
}
