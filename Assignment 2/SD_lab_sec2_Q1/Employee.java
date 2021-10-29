package sd_lab_sec2_q1;

public class Employee extends Person
{
    private double salary;
    private String office;
    private MyDate dateHired;
    
    public Employee(String name, double salary, String office, MyDate dateHired)
    {
        super(name);
        this.salary = salary;
        this.office = office;
        this.dateHired = dateHired;
    }
    
    public Employee(String name) 
    {
        this(name, 0, "", new MyDate());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }
    
    @Override
    public String toString() 
    {
        String Name = getName();
        String className = this.getClass().getSimpleName();
        return "Name: " + Name + " Class: " + className + "\n";
    }
    
    
}
