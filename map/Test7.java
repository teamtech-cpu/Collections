import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(22, "A");
        hashMap.put(55, "B");
        hashMap.put(33, "Z");
        hashMap.put(44, "M");
        hashMap.put(99, "L");
        System.out.println("Before sorting");
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }
        Map<Integer, String> map = sortByValues(hashMap);
        Set set1 = map.entrySet();
        Iterator it = set1.iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());
        }

    }

    private static Map<Integer, String> sortByValues(Map<Integer, String> hashMap) {
        List list = new LinkedList(hashMap.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });



    }
}
