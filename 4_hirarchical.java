//1
class hirarchical
{
    public static void main (String[] args)
    {
        Add a=new Add();
        a.setData(5,4);
        a.addition();

        Subtract s=new Subtract();
        s.setData(5,4);
        s.subtraction();

        Multiply m=new Multiply();
        m.setData(5,4);
        m.multiplication();

        Divide d=new Divide();
        d.setData(5,4);
        d.division();
    }
}
class Base
{
    int a,b;
    void setData(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
}
class Add extends Base
{
    void addition()
    {
        System.out.println("Addition="+(a+b));
    }
}
class Subtract extends Base
{
    void subtraction()
    {
        System.out.println("Subtraction="+(a-b));
    }
}
class Multiply extends Base
{
    void multiplication()
    {
        System.out.println("Multiplication="+(a*b));
    }
}
class Divide extends Base
{
    void division()
    {
        System.out.println("Division="+(a/b)+"\nRemainder= "+(a%b));
    }
}