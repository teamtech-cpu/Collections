import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("jack");
        al.add("jack");
        al.add("Elem");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
