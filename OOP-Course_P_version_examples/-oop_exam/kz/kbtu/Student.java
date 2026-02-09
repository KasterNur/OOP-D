package kz.kbtu;
import kz.Person;
public class Student extends Person{

    public Student()
    {
        super();
    }

    public Student(String name)
    {
        super.setName(name);

    }
    public static void main(String[] args) {
        
        Person  per = new Student("Ali");
        System.out.println("this is :"+per.getName());
    }

   
}