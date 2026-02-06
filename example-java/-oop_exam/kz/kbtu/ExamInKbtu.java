package kz.kbtu;
import kz.Person;

public class ExamInKbtu{
  public static void main(String[] args) {
    Person person1 = new Person("Manas");
    Person person2 = new Person("Almas");
    Person person3 = new Person("Nazim");
    
     kz.kbtu.AbstractClass myclas = new kz.kbtu.SubClass();
     myclas.printOne();
     myclas.printSecond();
     myclas.doItInTheFuture("are you ready!");

    System.out.println("He/She has static value: "
                        +person3.count1 
                        +" | no-static="+person3.count2);
    
  }  
} 