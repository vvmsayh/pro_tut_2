import javax.swing.*;
import java.util.ArrayList;
public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    ArrayList<Double> grades;
    public Student(){
        this.grades = new ArrayList<>();
    }
    public void addGrade(double grade) {
        grades.add(grade);
        if (this.grades.size() > 20) {
            System.out.print("There are 20 grades!");
            return;
        }
        if (grade <= 2.0 || grade >= 5.0) {
            throw new IllegalArgumentException("Please pass a grade between 2 and 5");
        }
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Grades cannot be empty.");
        }
    }

    public Double AvarageGrade (ArrayList<Double> grades){
        Double sum1 =0.0;
        for (Double grade: grades ){
            sum1+= grade;
        }
        sum1 = sum1/this.grades.size();
        System.out.println("Average sum =" + sum1);
        return sum1;
    }
}