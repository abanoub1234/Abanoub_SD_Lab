package sd_lab_sec5_q1;

import java.util.Scanner;

public class Sd_lab_sec5_q1 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        memberFactory memberFactory1 = new memberFactory();
        System.out.println("Enter Staff Degree");
        String degree = in.next();
        Staff s = memberFactory1.getStaffDegree(degree);
        s.getSalary();
        s.getYearsOfWorks();
    }
    
}
