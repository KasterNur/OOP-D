package week4;

public class Car extends Transport{
    
        public Car()
        {
            super();
            System.out.println("Car constructor");
        }

    public Car(String name)
    {
        // super(name);      
        System.out.println("Car constructor with name:"+name);
    }   

    public void drive()
    {
        this.move();
        System.out.println(" Car can drive."
                     +this.compay+" "
                     +this.getName());
    }

    public String getCompany()
    {
        return this.compay;
    }

    public void setCompany(String compay)
    {
        this.compay = compay;
    }   
 
    
    @Override
    public String toString() {
    // TODO Auto-generated method stub
    return this.getName()+" -"+ this.getCompany();
    }
}
