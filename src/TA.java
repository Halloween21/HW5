import java.util.ArrayList;

public class TA {
    public String name;
    public ArrayList<Course> courses;

    public TA (String name, ArrayList<Course> courses) {
        if (courses.isEmpty()) {
            System.out.println("Darf nicht leer sein!");
        } else {
            this.name = name;
            this.courses = courses;
        }
    }

    public ArrayList<Course> getCourse(){
        return this.courses;
    }
    public String getName(){
        return this.name;
    }
    public void extendContract(Course course){
        this.courses.add(course);
    }

    public void setName (String name){
        this.name=name;
    }
}
