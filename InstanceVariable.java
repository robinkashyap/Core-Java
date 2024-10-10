class Demo
{
    int num = 10;
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}

class InstanceVariable
{
    public static void main(String args[])
    {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.num = 5;
        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }

}