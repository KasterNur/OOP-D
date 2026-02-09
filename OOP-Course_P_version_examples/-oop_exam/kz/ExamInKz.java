package kz;
import kz.kbtu.Table;
public class ExamInKz extends Table {

  public static void main(String[] args) {
    Person person0 = new Person("Manas");
    Table table = new Table();
    java.util.Date date;
    java.sql.Date date2;
    Person person2 = new Person("Kuralai");
    Person person1 = new Person("Erbolsyn");
    
    Person person3 = new Person("Asilzhan");
    Person person4 = new Person("Elizat");
     
    
    System.out.println("He is name :"+ person1.getName()+
                                " "+person2.getName()+" "
                                + person3.getName() + 
                                " count="+person1.count1+ 
                                " count2="+person1.count2);
 
  }  
} 