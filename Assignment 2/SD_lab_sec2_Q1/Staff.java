package sd_lab_sec2_q1;

public class Staff extends Employee
{
    private String title;

    public Staff(String name) 
    {
        this(name, "");

    }

    public Staff(String name, String title) 
    {
        super(name);
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    @Override
    public String toString() 
    {
        String Name = getName();
        String className = this.getClass().getSimpleName();
        return "Name: " + Name + " Class: " + className + "\n";
    }
}
