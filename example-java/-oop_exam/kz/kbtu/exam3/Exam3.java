package kz.kbtu.exam3;

import kz.Person;
import kz.kbtu.Table;
public class Exam3 extends Table {

  public static void main(String[] args) {
    
    Person person1 = new Person("Manas");
    Person person2 = new Person("Almas");
    Person person3 = new Person("Gulnur");
    Person person4 = new Person("Nurzat");
    System.out.println("Those study in "+ Person.KBTU
                      +" There has  ="+Person.count1 
                                  +" |"+person4.count2 +
                      " student.");
    Table table = new Table();
    java.util.Date date;
    java.sql.Date date2;

  }  
} 