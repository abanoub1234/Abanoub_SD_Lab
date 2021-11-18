package sd_lab_sec5_q1;

public class TeachingAssistant implements Staff
{

    @Override
    public void getSalary() 
    {
        System.out.println("Teaching Assistant Salary= " + 2800);
    }

    @Override
    public void getYearsOfWorks() 
    {
        System.out.println("num Years Of Works= " + 5);
    }
    
}
