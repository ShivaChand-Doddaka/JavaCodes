class Prog1
{
    public static void main(String[] args) {
        Test2 obj1 = new Test2();
        obj1.testMethod1();
        obj1.testMethod2();        
    }
}

abstract class Test1
{
    public abstract void testMethod1();
    public void testMethod2()
    {
        System.out.println("This is a normal method");
    }
}

class Test2 extends Test1
{
    public void testMethod1()
    {
        System.out.println("This is a abstract method defined in subclass.");
    }
}