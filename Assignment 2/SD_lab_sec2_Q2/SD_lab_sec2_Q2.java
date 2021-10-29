package sd_lab_sec2_q2;

import java.util.Scanner;

public class SD_lab_sec2_Q2 
{

    public static void main(String[] args) 
    {
      Student student = new Student("Abanoub", "2091280", "3.17");
      
      student.inputStudentInfo();
      student.calculateGPA();
      student.PrintStudentInfo();
    }
    
}
