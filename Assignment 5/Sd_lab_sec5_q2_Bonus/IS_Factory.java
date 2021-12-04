package sd_lab_sec5_q2_bonus;

public class IS_Factory extends Abstract_Factory
{

    @Override
    public Staff getStaffName(String StaffName)
    {
        if(StaffName.equalsIgnoreCase("IS_Doctor"))
        {
           return new IS_Doctor();
        }
        else if(StaffName.equalsIgnoreCase("IS_Assistant"))
        {
           return new IS_Assistant();
        }
        else
        {
           return null;
        }
    }
    
}
