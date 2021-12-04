package sd_lab_sec5_q2_bonus;

public class IT_Factory extends Abstract_Factory
{

    @Override
    public Staff getStaffName(String StaffName) 
    {
        if(StaffName.equalsIgnoreCase("IT_Doctor"))
        {
           return new IT_Doctor();
        }
        else if(StaffName.equalsIgnoreCase("IT_Assistant"))
        {
           return new IT_Assistant();
        }
        else
        {
           return null;
        }
    }
    
}
