public class Student implements Comparable<Student>{
    private int rollno;

    private int stuAge;

    private String stuName;

    public Student(int rollno, int stuAge, String stuName) {
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

    @Override
    public int compareTo(Student o) {
        int compareage = o.getStuAge();
        return this.getStuAge()-compareage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", stuAge=" + stuAge +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
