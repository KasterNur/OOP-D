package week4.obj.animals;

public class Animals {
    private int id;
    private String name;
    String type="no type";
    public int getId() {
        return id;
    }

    public String getType()
    {
        return this.type;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Animals()
    {
        this.type = "Animals";  
        System.out.println("Animals constructor :"+
                            this.type);
        
    }

    public void eat()
    {
        System.out.println("Animals eat");
    }
}
