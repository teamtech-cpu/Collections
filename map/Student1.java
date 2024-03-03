import java.util.Comparator;

public class Student1 {
    private int rollno;

    private int stuAge;

    private String stuName;

    public Student1(int rollno, int stuAge, String stuName) {
        this.rollno = rollno;
        this.stuAge = stuAge;
        this.stuName = stuName;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public static Comparator<Student1> student1Comparator = new Comparator<Student1>() {
        @Override
        public int compare(Student1 o1, Student1 o2) {
            String s1=o1.getStuName().toLowerCase();
            String s2 = o2.getStuName().toLowerCase();
            return s1.compareTo(s2);
        }
    };

    public static  Comparator<Student> studentageComparator= new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int s1 = o1.getStuAge();
            int s2 = o2.getStuAge();
            return s1-s2;
        }
    };

    @Override
    public String toString() {
        return "Student1{" +
                "rollno=" + rollno +
                ", stuAge=" + stuAge +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
