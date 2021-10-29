package sd_lab_sec2_q1;

public class Faculty extends Employee
{
    
    String TeachingAssistant = "Teaching Assistant";
    String AssistantProfessor = "Assistant Professor";
    String professor = "professor";

    private String officeHours;
    private String rank;
    
    public Faculty(String name) 
    {
        this(name,"", "");
    }

    public Faculty(String name, String officeHours, String rank) 
    {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() 
    {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) 
    {
        this.officeHours = officeHours;
    }

    public String getRank() 
    {
        return rank;
    }

    public void setRank(String rank) 
    {
        this.rank = rank;
    }

    @Override
    public String toString() 
    {
        String Name = getName();
        String className = this.getClass().getSimpleName();
        return "Name: " + Name + " Class: " + className + "\n";
    }
    
}
