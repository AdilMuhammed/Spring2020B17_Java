package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
create a class called school:
                    create 3 objects of student and set thier info
                    create a an ArrayList of students to store all student objects
                    use for each loop to print out each students' name and studentID
 */

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("Barzy", 27, 'M', 123, "Batch17");
        student2.setStudentInfo("Hunar", 34, 'M', 456, "Batch18");
        student3.setStudentInfo("Rahman", 28, 'M', 789, "Batch17");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1, student2, student3));

        for (Student each : studentList){
            // System.out.println(each);
            System.out.println("name: "+each.name+", ID: "+each.studentID);
        }



    }




}
