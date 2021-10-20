package sd.lab_q2;
import java.util.Date;

public class Account 
{
    private int id=0;
    private double balance = 0;
    private double annualInterestRate=0;
    private Date dateCreated;

    public Account() 
    {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new java.util.Date();
    }
    
    public Account(int id , double Balance) 
    {
        this.id = id;
        this.balance = Balance;
    }
    
    public Account(int id, double balance, double annualInterestRate) 
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new java.util.Date();
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }
    
    public double getMonthlyInterest()
    {
        return annualInterestRate/12;
    }
    
    public double withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("the Amount not Enough");
        } 
        else 
        {
            balance = balance - amount;
        }
        return balance;
    }
    
    public double deposit(double amount)
    {
        balance = balance + amount;
        return balance;
    }
    
    /*public void printAccount() 
    {
        System.out.println("---------------Account Information------------");
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate);
        System.out.println();
    }*/


    
}
