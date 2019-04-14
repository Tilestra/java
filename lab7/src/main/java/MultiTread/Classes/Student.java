package MultiTread.Classes;

import java.util.ArrayList;
import java.util.List;

public class Student {

    public Student(String name, boolean inOrOut){
        this.name = name;
        this.inOrOut = inOrOut;
    }

    private String name;
    public String getName(){
        return name;
    }

    private boolean inOrOut;
    public boolean getInOrOut(){
        return inOrOut;
    }


    public static List<Student> GetStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Ilya", true));
        students.add(new Student("Artem", false));
        students.add(new Student("Nikita", true));
        students.add(new Student("Katya", false));
        students.add(new Student("Nastya", true));
        students.add(new Student("Kolya", false));
        return students;
    }
}
