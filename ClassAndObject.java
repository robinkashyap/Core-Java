class Calculator
{
    public int add(int num1,int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
}

public class ClassAndObject
{
    public static void main(String args[])
    {
        int n1 = 4;
        int n2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(n1,n2);
        System.out.println(result);
    }

}
