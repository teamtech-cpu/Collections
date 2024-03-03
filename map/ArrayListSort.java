import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(11, 21, "sai"));
        list.add(new Student(12, 20, "mvn"));
        list.add(new Student(13, 23, "srav"));

        Collections.sort(list);

        for (Student st : list) {
            System.out.println(st);
        }
        List<Student1> list1 = new ArrayList<>();
        list.add(new Student(11, 21, "sai"));
        list.add(new Student(12, 20, "mvn"));
        list.add(new Student(13, 23, "srav"));
        Collections.sort(list1, Student1.student1Comparator);
        for (Student1 str : list1) {
            System.out.println(str);

        }
    }
}
