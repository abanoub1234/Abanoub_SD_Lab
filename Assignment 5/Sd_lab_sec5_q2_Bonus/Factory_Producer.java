package sd_lab_sec5_q2_bonus;

public class Factory_Producer 
{
    public static Abstract_Factory getFactory(String staffname)
    {
       if(staffname=="CS")
       {
          return new CS_Factory();
       }
       else if(staffname=="IS")
       {
         return new IS_Factory();
       }
       else if(staffname=="IT")
       {
         return new IT_Factory();
       }
       else
       {
         return null;
       }
       
    }
}
