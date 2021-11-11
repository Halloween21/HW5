import java.util.ArrayList;

public class Department {
    public String name;
    public ArrayList<Employee> employee;
    public Professor[] chair=new Professor[1];
    public ArrayList<Course> course;

    public Department (String name, ArrayList<Employee> e, Professor[] p, ArrayList<Course> c){
        this.name=name;
        this.employee=e;
        this.chair=p;
        this.course= c;
    }
}

class Employee {
    public String name;
    public int eID;

}