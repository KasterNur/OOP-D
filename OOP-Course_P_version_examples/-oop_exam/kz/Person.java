package kz;

 public class Person {
    private String name;
    private int age;
    String nation;
    protected String gender; 
    //more fields   
     public static int count1 =0;
     public   int count2;
     public final static String KBTU ="KBTU";
     
    //javaEE 
    
    public String getName()
    {
        
       return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
        
    }

    public Person()
    {
        this.age = 0;
        this.gender="";
        this.name = null;
        this.nation = null;
    }

    public Person(String name)
    {
        this.age = 0;
        this.gender="";
        this.name = name;
        this.nation = null;
        count1 ++;
        count2++;
    }
}