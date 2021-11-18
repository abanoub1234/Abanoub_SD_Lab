package sd_lab_sec5_q1;

public class Doctor implements Staff
{

    @Override
    public void getSalary() 
    {
        System.out.println("Doctor Salary= " + 4000);
    }

    @Override
    public void getYearsOfWorks() 
    {
        System.out.println("num Years Of Works= " + 10);
    }
    
}
