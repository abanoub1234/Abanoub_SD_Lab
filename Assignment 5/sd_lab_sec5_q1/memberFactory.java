package sd_lab_sec5_q1;

public class memberFactory 
{
    public  Staff getStaffDegree(String Degree)
    {
       if(Degree == null)
       {
           return null;
       }
       else if(Degree.equalsIgnoreCase("TeachingAssistant"))
       {
          return new TeachingAssistant();
       }
       else if(Degree.equalsIgnoreCase("Doctor"))
       {
          return new Doctor();
       }
       
       return null;
    }
}
