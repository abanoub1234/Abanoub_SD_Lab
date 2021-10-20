package sd.lab_q2;

/**
 @author Eng.Abanoub
 */
public class SDLab_Q2 {


    public static void main(String[] args) 
    {
        Account account = new Account(1122 , 20000 , 4.5);
        
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance Now is: " + account.getBalance());
        System.out.println("Monthly Interest is: " + account.getMonthlyInterest());
        System.out.println("the Date when Account was Created: " + account.getDateCreated());
    }
    
}
