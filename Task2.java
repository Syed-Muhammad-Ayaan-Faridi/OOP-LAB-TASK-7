import javax.xml.crypto.URIDereferencer;

class Courses{
    protected String courseCode;
    protected String courseName;
    protected Integer courseCredit;

    public Courses(String Name,String code,Integer credit){
        this.courseName = Name;
        this.courseCode = code;
        this.courseCredit = credit;
    }

    public void setCourseCode(String code){
        this.courseCode = code;
    }
    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
class UndergraduateCourse extends Courses{
    protected String departmentName;
    protected Integer Level;

    public UndergraduateCourse(String Name,String Code,Integer Credit,String deptName,Integer level){
        super(Name, Code, Credit);
        this.departmentName = deptName;
        this.Level = level;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setLevel(Integer level) {
        Level = level;
    }

}
class Registration extends UndergraduateCourse{
    private Courses course;
    private Integer numStudents;
    private Integer maxStudent;
    private Boolean isClosed;

    public Registration(String Name,String Code,Integer Credit,String deptName,Integer level,Integer Numstd,Integer maxstd,boolean isclosed){
        super(Name, Code, Credit, deptName, level);
        this.numStudents = Numstd;
        this.maxStudent = maxstd;
        this.isClosed = isclosed;
    }
    
    public void setCourse(Courses Course) {
        this.course = Course;
    }
    public void setNumStudents(Integer numStudents) {
        this.numStudents = numStudents;
    }
    public void setMaxStudent(Integer maxStudent) {
        this.maxStudent = maxStudent;
    }
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public void registerStudent(){
        if (isClosed) {
            System.out.println("Registration closed");
        }
        else if (numStudents < maxStudent) {
            numStudents++;
            System.out.println("Registration succeessful");
        }
        else {
            System.out.println("Course Full");
            isClosed = true;
        }
    }

    public void display(){
        System.out.println("Course Details:");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + courseCredit);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Students Registered: " + numStudents);

        if (isClosed) {
            System.out.println("registration Closed.");
        }
    }
}
public class Task2 {
    public static void main(String[] args) {
        UndergraduateCourse UGcourse = new UndergraduateCourse(null, null, null, null, null);
        UGcourse.setCourseName("Object Oriented Programming");
        UGcourse.setCourseCode("CS1004");
        UGcourse.setCourseCredit(3);
        UGcourse.setDepartmentName("Software Development");
        UGcourse.setLevel(1);

        Registration newRegistration = new Registration(null, null, null, null, null, null, null, false);
        newRegistration.setCourse(UGcourse);
        newRegistration.setCourseName("Object Oriented Programming");
        newRegistration.setCourseCode("CS1004");
        newRegistration.setCourseCredit(3);
        newRegistration.setDepartmentName("Software Engineering");
        newRegistration.setLevel(1);
        newRegistration.setNumStudents(0);
        newRegistration.setMaxStudent(10);
        newRegistration.setIsClosed(false);
        newRegistration.registerStudent();
        newRegistration.registerStudent();
        newRegistration.registerStudent();
        newRegistration.registerStudent();
        newRegistration.display();
    }
}
