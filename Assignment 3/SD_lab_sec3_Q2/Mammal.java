package sd_lab_sec3_q2;


public class Mammal implements Animal
{
    
    private int numberOfLegs;
    private String FavFood;

    public Mammal(int numberOfLegs, String FavFood) 
    {
        this.numberOfLegs = numberOfLegs;
        this.FavFood = FavFood;
    }

    
    
    @Override
    public void eat()
    {
      System.out.println("Eating " + FavFood + " now");
    }

    @Override
    public void trevel() 
    {
        System.out.println("trevel now");
    }
    
    public int NoOfLegs()
    {
       return numberOfLegs;
    }
    
    public String FavFood()
    {
       return FavFood;
    }
    
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFavFood() {
        return FavFood;
    }

    public void setFavFood(String FavFood) {
        this.FavFood = FavFood;
    }

    
}
