import java.util.ArrayList;

public class Exam {
    public int max_value;
    public Course course;
    public ArrayList<Question> questions;
    public ArrayList<Student> student;

    public Exam(int max_value, Course course,ArrayList<Question> questions, ArrayList<Student> student  ){
        if (questions.isEmpty()){
            System.out.println("Darf nicht leer sein!");
        }
        else {
            this.max_value=max_value;
            this.course=course;
            this.questions=questions;
            this.student=student;
        }
    }

    public boolean register(Student student){
        return this.student.contains(student);
    }

    public void addQuestion (int id, String task, int value){
        Question q=new Question(id, task, value);
        this.questions.add(q);
    }

    public ArrayList<Student> getRegisteredStudents(){
        return this.student;
    }

    public void setMaxValue(int max){
        this.max_value = max;
    }

     class Question {
        public String task;
        public int maxValue;
        public int qid;

        public Question(int id, String task, int value){
            this.qid=id;
            this.task=task;
            this.maxValue=value;

        }
    }
}


