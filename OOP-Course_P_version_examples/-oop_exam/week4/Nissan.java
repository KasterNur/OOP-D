package week4;

public class Nissan extends Car {
    
    
    public String getBrand()
    {
        return "This car is Nissan";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getBrand();
    }
    
}
