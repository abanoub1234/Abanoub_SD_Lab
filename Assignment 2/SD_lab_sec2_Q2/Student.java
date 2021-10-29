package sd_lab_sec2_q2;

import java.util.Scanner;

public class Student 
{
    private String studentName , studentID ,studentGPA;
    int[] subjects = new int[6];
    Scanner input = new Scanner(System.in);
    Subject subject = new Subject();
    Address address = new Address();

    public Student(String studentName, String studentID, String studentGPA)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGPA = studentGPA;
    }
    
    public String getStudentName() 
    {
        return studentName;
    }

    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }

    public String getStudentGPA() 
    {
        return studentGPA;
    }

    public void setStudentGPA(String studentGPA)
    {
        this.studentGPA = studentGPA;
    }
    
    public void inputStudentInfo()
    {
        //get Address from user
        System.out.print("Enter your StreetNo: ");
        address.streetNo = input.nextInt();
        System.out.print("Enter your City: ");
        address.City = input.next();
        System.out.print("Enter your Country: ");
        address.Country = input.next();
        System.out.println("\n");
        
        //get subject name from user
        for(int i=0 ; i<6 ; i++)
        {
           System.out.print("Enter name of  subject " + (i+1) + ": " );
           subject.subjectName[i] = input.next();
           System.out.print("Enter subject " + (i+1) + " ID: " );
           subject.subjectID[i] = input.next();
           System.out.print("Enter subject " + (i+1) + " Hours: " );
           subject.subjectHours[i] = input.nextInt();
           System.out.println("\n");
        }
            
    }
    
    public void calculateGPA()
    {
        int sum=0;
        for(int i=0 ; i<subjects.length ; i++)
        {
           System.out.print("Enter subject " + (i+1) + " score: ");
           subjects[i] = input.nextInt();
           sum+=(subjects[i]/3);
        }
        double GPA = sum/18 ;
        System.out.println("GPA of student " +studentName + "is " + GPA);
        
    }
    
    public void PrintStudentInfo()
    {
        System.out.println("Student Name: " + studentName + " studentID: " + studentID + " studentGPA: " + studentGPA
                +"\n" + "StreetNo: " + address.streetNo + " City: " + address.City + " country: " + address.Country
                +"\n" );
       for(int i=0 ; i<6 ; i++)
        {
            System.out.println("subject" + (i+1) + "name: " + subject.subjectName[i] + " " + "ID: " + subject.subjectID[i] + " " 
            + "Score : " + subjects[i]);
        }
        
    }
     
}
