package sd_lab_sec5_q2_bonus;

public class Sd_lab_sec5_q2_Bonus 
{

    public static void main(String[] args) 
    {
        //CS Factory
        System.out.println("===================CS Factory================");
        
        Abstract_Factory AF1 = Factory_Producer.getFactory("CS");
        
        Staff  csDocrot = AF1.getStaffName("CS_Doctor");
        
        csDocrot.StaffName();
        
        Staff  csAssistant = AF1.getStaffName("CS_Assistant");
        
        csAssistant.StaffName();
        
        //IS Factory
        System.out.println("==================IS Factory=================");
        
        Abstract_Factory AF2 = Factory_Producer.getFactory("IS");
        
        Staff  isDocrot = AF2.getStaffName("IS_Doctor");
        
        isDocrot.StaffName();
        
        Staff  isAssistant = AF2.getStaffName("IS_Assistant");
        
        isAssistant.StaffName();
        
        //IT Factory
        System.out.println("=================IT Factory==================");
        Abstract_Factory AF3 = Factory_Producer.getFactory("IT");
        
        Staff  itDocrot = AF3.getStaffName("IT_Doctor");
        
        itDocrot.StaffName();
        
        Staff  itAssistant = AF3.getStaffName("IT_Assistant");
        
        itAssistant.StaffName();
        
        
    }
    
}
