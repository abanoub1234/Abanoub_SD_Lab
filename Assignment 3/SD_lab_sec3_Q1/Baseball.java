package sd_lab_sec3_q1;

public class Baseball extends Ball
{

    public Baseball(String brandName) 
    {
        super(brandName);
    }
    
    @Override
    public void toos() 
    {
        System.out.println("in Baseball class");
    }
    
    @Override
    public void bounce()
    {
        
    }
    
}
