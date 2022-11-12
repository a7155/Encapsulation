
/**
 *
 * @author 4715
 */
// Class Teacher subclass dari Person
public class Teacher extends Person{
    //Instance variabel
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;
    
    //constructor
    public Teacher(String name, String address) {
        super(name, address);
        numCourses =0;
        courses = new String[MAX_COURSES];
    }

    @Override
    public String toString() {
        return "Teacher" + super.toString(); 
    }
    
    //menampilkan kesalahan jika data yang di tambahkan ada yang sama
    public boolean addCourse (String course){
    //cek jika course sudah ada di list course
    for (int i =0; i <numCourses; i++){
    if (courses[i].equals(course)) return false;
    }
    courses[numCourses]= course;
    numCourses++;
    return true;
    }
    
    //menampilkan kesalahan jika data belum ada di list course
    public boolean removeCourse(String course){
    boolean found = false;
    //untuk melihat course index
    int courseIndex = -1;
    for (int i = 0; i < numCourses; i++){
        if (courses[i].equals(course)){
        courseIndex =i;
        found = true;
        break;
        } 
    }
    if (found){ //course tidak di temukan untuk di hapus
    for (int i = courseIndex; i < numCourses-1; i++){
        courses[i]= courses[i+1];
    }
    numCourses--;
    return true;
    } 
    else {
    return false;
    }
   }
}

