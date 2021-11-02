package sd_lab_sec3_q1;

public class Football extends Ball
{
    public Football(String brandName) 
    {
        super(brandName);
    }
    
    @Override
    public void toos() 
    {
        System.out.println("in Football class");
    }
    
    @Override
    public void bounce()
    {
        
    }
}
