
/**
 *
 * @author 4715
 */
import java.util.Scanner;
public class Tes {
    public static void main(String[] args) {
        //tes student
        Student s = new Student("Ajis", "Sekarwangi");
        s.addCourseGrade("TI101M", 97);
        s.addCourseGrade("TI102M", 68);
        s.printGrades();
        System.out.println("Rata-Rata" + s.getAverageGrade());
        
        //tes Teacher
        Teacher t = new Teacher("Budi", "Cibadak");
        System.out.println(t);
        String[] courses = {"TI101M","TI102M","TI101M"};
        
        for (String course: courses) {
            if (t.addCourse(course)) {
                System.out.println(course + " added.");
            } else {
                System.out.println(course + " cannot be added.");
            }
        }
        for (String course: courses) {
            if (t.removeCourse(course)) {
                System.out.println(course + " removed.");
            } else {
                System.out.println(course + " cannot be removed.");
            }
        }
    }
    
}   
