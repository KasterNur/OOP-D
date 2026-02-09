import java.util.Scanner;

public class TestJava 
{
    
    /**
     * multiful line commen t
     */

    public static void main(String arg[])
    {
        Scanner scan1 = new Scanner(System.in);
        
        String name= ""; // single line comment 
        System.out.println("Please input your name: ");
        name = scan1.next();
        
        System.out.println("your name:"+name);
        
        System.out.println("Hello !");
        

    }
}