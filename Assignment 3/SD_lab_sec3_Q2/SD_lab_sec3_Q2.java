package sd_lab_sec3_q2;

public class SD_lab_sec3_Q2 
{

    public static void main(String[] args) 
    {
       Mammal m = new Mammal(4, "meat");
        System.out.println(m.FavFood());
        System.out.println(m.NoOfLegs());
        m.eat();
    }
    
}
