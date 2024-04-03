import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.fname = "John";
        S1.lname = "Lennon";
        S1.indexNumber ="s696969";
        S1.email = "LennonJohnD@gmail.com";
        S1.address = "742 EverGreen str Springfield";
        S1.addGrade(4.5);
        S1.addGrade(3.4);
        S1.addGrade(4.3);
        System.out.println(S1.grades);
        double avar = S1.AvarageGrade(S1.grades);
        System.out.println(avar);

    }
}