import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(16);
        li.add(18);
        li.add(6);
        li.add(9);
        li.add(7);

        if(li.contains(7)){
            System.out.println("7 was present in the list");
        }else{
            System.out.println(("7 is not there in the list"));
        }

    }
}
