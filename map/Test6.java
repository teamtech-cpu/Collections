import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key","value3");
        for(String key: map.keySet()){
            System.out.println("key:"+key+"value:"+map.get(key));
        }
        Set<String> keySet = map.keySet();
        Iterator<String> keySetIterator = keySet.iterator();
        while(keySetIterator.hasNext()){
            String key =keySetIterator.next();
            System.out.println(keySetIterator.next());
            System.out.println("key:"+key+"value:"+map.get(key));
        }
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry entry:entrySet){
            System.out.println(entry.getKey()+"value:"+entry.getValue());
        }

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"value:"+entry.getValue());
        }

    }
}
