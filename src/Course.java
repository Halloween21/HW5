import java.util.ArrayList;


public class Course {
    public int id;
    public String name;
    public int maxCapacity;
    public Professor prof;
    public boolean isFull =false;
    public ArrayList<Student> students;
    public ArrayList<Exam> exam;

    public Course (int id, String name, int cap, Professor prof, ArrayList<Exam> exam){
        if (exam.isEmpty()){
            System.out.println("Darf nicht leer sein!");
        }
        else {
        this.id=id;
        this.name=name;
        this.maxCapacity = cap;
        this.prof=prof;
        this.exam=exam;}
    }

    public void enroll (Student student){
        this.students.add(student);
    }

    public void setMaxCap (int max){
        this.maxCapacity=max;
    }
}
