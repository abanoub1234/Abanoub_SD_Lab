package sd_lab_sec2_q1;

public class Person
{
    private String Name , Address , phoneNumber , Email;

    public Person(String Name) 
    {
        this.Name = Name;
    }

    public String getName() 
    {
        return Name;
    }

    public void setName(String Name) 
    {
        this.Name = Name;
    }

    public String getAddress() 
    {
        return Address;
    }

    public void setAddress(String Address) 
    {
        this.Address = Address;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() 
    {
        return Email;
    }

    public void setEmail(String Email) 
    {
        this.Email = Email;
    }
    
    @Override
    public String toString() 
    {
        String Name = getName();
        String className = this.getClass().getSimpleName();
        return "Name: " + Name + " Class: " + className + "\n";
    }
    
    
    
}
