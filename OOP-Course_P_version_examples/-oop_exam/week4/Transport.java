package week4;

public class Transport {
    private int id =-1;
    String name="empty";
    protected String compay="empty";

    // public {get;set;}
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Transport()
    {
        System.out.println("Transport constructor");
        this.compay = "KZ";
        this.id= 0;
        this.name = "Not set name yet";
    }

    // public Transport(String name)
    // {
    //     System.out.println("Transport constructor with name:"+name);
    //     this.name = name;
    // }

    protected void move()
    {
        System.out.println("Transprot move.");
    }



}
