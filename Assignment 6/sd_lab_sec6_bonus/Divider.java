package sd_lab_sec6_bonus;

public class Divider implements Divide
{
    DividerAdapter d ; 
    
    @Override
    public float BigDecimal(String type,float x, float y) 
    {
        if(type.equalsIgnoreCase("div"))
        {
            return x/y;
        }
        else if(type.equalsIgnoreCase("mul"))
        {
          d = new DividerAdapter(type);
          return d.BigDecimal("mul", x, y);
        }
        else
        {
          return 0;
        }
    }
    
}
