package sd_lab_sec2_q1;

public class Student extends Person
{
    final String newComer = "new comer";
    final String Junior = "Junior";
    final String Senior = "Senior";
    private String status;

    public Student(String name) 
    {
        super(name);
    }

    public Student(String name, String status) 
    {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() 
    {
        String Name = getName();
        String className = this.getClass().getSimpleName();
        return "Name: " + Name + " Class: " + className + "\n";
    }    

}
