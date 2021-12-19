package sd_lab_sec6_bonus;

public class DividerAdapter implements Divide
{
    public static Multibly m ;
    public static Divide d;
    
    public  DividerAdapter(String OP) 
    {
          if(OP.equalsIgnoreCase("mul"))
          {
              m = new Multiplier();
          }
          else if(OP.equalsIgnoreCase("div"))
          {
             d = new Divider();
          }
          else
          {
              System.out.println("Error");
          }
    }
    
    
    @Override
    public float BigDecimal(String type ,float x, float y) 
    {
        if(type.equalsIgnoreCase("mul"))
          {
              return m.BigDecimal("mul", x, y);
          }
         else if(type.equalsIgnoreCase("div"))
          {
             return d.BigDecimal("div", x, y);
          }
          else
          {
             return 0;
          }
    }

    
}
