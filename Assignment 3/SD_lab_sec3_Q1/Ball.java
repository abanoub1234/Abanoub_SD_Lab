package sd_lab_sec3_q1;

public class Ball implements Toosable
{
    private String brandName;
    
    @Override
    public void toos() {
        System.out.println("in Ball class");
    }

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    
    public void bounce()
    {
        
    }
    
}
