import java.util.ArrayList;

public class Project {
    public String name;
    public ArrayList<Student> members;
    public Course course;

    public String getName(){
        return this.name;
    }
    public void setName (String n){
        this.name=n;
    }
    public void addNewMember(Student s){
        this.members.add(s);
    }
    public ArrayList<Student> getMembers(){
        return this.members;
    }

    public Project(String name, ArrayList<Student> members, Course course){
      if (members.isEmpty()){
          System.out.println("Darf nicht leer sein!");
      }
      else {
       this.name=name;
        this.members=members;
        this.course=course;
        }
    }
}
 class Student {
    public String name;
    public int studentId;
    public ArrayList<Project> project;
    public ArrayList<Course> courses;
    public ArrayList<Exam> exam;

    public String getName(){
        return this.name;
    }

    public ArrayList<Project> getProject(){
        return this.project;
    }

    public Student (String name, int studentId, ArrayList<Project> project, ArrayList<Course> courses, ArrayList<Exam> exam){
        if (courses.isEmpty()){
            System.out.println("Darf nicht leer sein!");
        }
        else {
            this.name = name;
            this.studentId = studentId;
            this.project = project;
            this.courses = courses;
            this.exam = exam;
        }
    }
}
