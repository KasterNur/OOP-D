package kz.kbtu;

public abstract class AbstractClass {
    
    public void printOne()
    {
        System.out.println("Print first");
    }

    public void printSecond()
    {
        System.out.println("Print 2's");
    }

    public abstract void doItInTheFuture(String message);
}
