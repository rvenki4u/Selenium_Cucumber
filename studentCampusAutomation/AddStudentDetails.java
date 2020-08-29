public class AddStudentDetails {
    String name;
    int rollNo;
    String course;

    public AddStudentDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    public void display()
    {
        System.out.println("Name="+name);
        System.out.println("RollNo="+rollNo);
        System.out.println("Course="+course);
    }
    public static void main(String[] args) {
        AddStudentDetails asd1 = new AddStudentDetails("Bala", 123, "CSE");
        AddStudentDetails asd2 = new AddStudentDetails("Venkat", 120, "EIE");
        asd1.display();

    }
}
