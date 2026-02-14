package week4.obj.animals;

public class Alabai extends Dog {
    public Alabai()
    {
        this.type = "Alabai";
        System.out.println("Alabai constructor: " 
                            + this.type);
    }

    public void ProtectHouse()
    {
        System.out.println("Alabai protect house");
    }
    
    @Override
    public String toString()
    {
        return "Alabai [id=" + getId() + ", name=" + getName() + ", type=" + getType() + "]";
    }

    @Override
    public boolean equals(Object obj)
    {  
        Alabai alabai = (Alabai) obj;
        if(this.getId() == alabai.getId())
            return true;
        return false;
    }
       
}
