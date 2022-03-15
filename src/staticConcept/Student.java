package staticConcept;

public class Student {
    public  static final String COLLEGE_NAME="XYZ";
    private int roll_number;
    private String name;
    private String course;
    private String address;


    public Student(int roll_number, String name, String course, String address) {
        this.roll_number = roll_number;
        this.name = name;
        this.course = course;
        this.address = address;
    }
    public int getRoll_number()
    {
        return roll_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_number=" + roll_number +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //    Instance level
    public void greet()
    {
        System.out.println("Good Morning");
        System.out.println(roll_number);
    }
    //    Static method
    public static void printCollege()
    {
        System.out.println(COLLEGE_NAME);
    }



}
