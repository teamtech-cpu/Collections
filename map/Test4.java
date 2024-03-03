import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(12);
        list.add(10);
        list.add(3);
        list.add(5);
        for(Integer s :list) {
            System.out.println(s);
        }

    }
}
