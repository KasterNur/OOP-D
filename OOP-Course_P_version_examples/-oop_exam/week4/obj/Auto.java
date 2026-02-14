public class Auto {
    private int id;
    String name;
    protected String brand;
    public short year;

    public int GetId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Auto(String brand)
    {
        this.id = 0;
        this.name = "not set yet";
        this.brand = brand;
        this.year = 2026;
    }
}
