
import javax.print.DocFlavor;


/**
 *
 * @author 4715
 */

// CLass Student subclass dari Person
public class Student extends Person{
    
    //instance variabel
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int Max_COURSES = 30;
    
    //constructor
    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[Max_COURSES];
        grades = new int[Max_COURSES];
    }

    @Override
    public String toString() {
        return "Student : " + super.toString(); 
    }
    
    // menambahkan course dan grade
    public void addCourseGrade(String course, int grade) {
       courses[numCourses] = course;
       grades[numCourses] = grade;
       ++numCourses;
    }
    
    //mencetak semua course dan grade
    public void printGrades(){
        System.out.println(this);
        for (int i = 0; i < numCourses; ++i){
            System.out.println("" + courses[i] + ":" + grades[i]);
        }
        System.out.println("");
    }
    
    //menghitung rata-rata grade
    public double getAverageGrade(){
    int sum =0;
    for (int i = 0; i < numCourses; i++){
    sum +=grades[i];
    }
    return (double) sum/numCourses;
    }
}
