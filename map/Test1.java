import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Alias",27);
        map.put("Bob",23);
        map.put("Alice",25);
        map.put("Alia",26);

        System.out.println(map.get("Alias"));
    }
}
