public class TestAbstract extends SimpleAbstract {

    @Override
    public String doSomething() {
        return "Doing something in TestAbstract";
    }

    public static void main(String[] args) {
        TestAbstract test = new TestAbstract();
        SimpleAbstract abs= new TestAbstract();
        test.print(); // This will call the concrete method from SimpleAbstract
        System.out.println(test.doSomething()); // This will call the implemented abstract method
    }
    
}
