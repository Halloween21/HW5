import java.util.ArrayList;

public class Professor extends Employee{

    public String name;
    public ArrayList<Course> courses;
    public ArrayList<Exam> exam;
    public TA assistant;

    public Professor(String name, ArrayList<Course> courses, ArrayList<Exam> exam){
        this.name=name;
        this.courses=courses;
        this.exam=exam ;
    }

    public void publish_course(){
        System.out.println(this.courses.toString());
    }
    public void assign_TA(TA assistant){
       this.assistant=assistant;
    }
    public void addNewCourse(Course course){
        this.courses.add(course);
    }

}
