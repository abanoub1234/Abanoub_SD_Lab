package sd_lab_sec5_q2_bonus;

public class CS_Factory extends Abstract_Factory
{

    @Override
    public Staff getStaffName(String StaffName) 
    {
        if(StaffName.equalsIgnoreCase("CS_Doctor"))
        {
           return new CS_Doctor();
        }
        else if(StaffName.equalsIgnoreCase("CS_Assistant"))
        {
           return new CS_Assistant();
        }
        else
        {
           return null;
        }
    }
    
}