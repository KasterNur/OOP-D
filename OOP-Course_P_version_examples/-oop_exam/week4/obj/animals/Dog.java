package week4.obj.animals;

public class Dog extends Animals {
    public Dog()
    {
        // super();
        this.type = "Alabai";
        System.out.println("Dog constructor: " 
                            + this.type);
    }

    public Dog(String type)
    {
        this.type = type;
        System.out.println("Dog constructor: " 
                            + this.type);
    }

 

}
