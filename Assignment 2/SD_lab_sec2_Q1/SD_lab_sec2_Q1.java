package sd_lab_sec2_q1;

public class SD_lab_sec2_Q1 
{

    public static void main(String[] args) 
    {
        Person person = new Person("Abanoub Emad");
        Student student = new Student("Abanoub");
        Employee employee = new Employee("Khaled");
        Faculty faculty = new Faculty("FCI");
        Staff staff = new Staff("Eng.Mahmoud");

        System.out.println(person.toString() + student.toString() + employee.toString() + faculty.toString() + staff.toString());

    }
    
}
