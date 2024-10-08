class Method
{
    public void musicPlayer()
    {
        System.out.println("Playing Music..");
    }

    public String givemePen(int cost)
    {
        if (cost>=10)
        {
            return "Pen";
        }
        return "Nothing";
    }
}

class FunctionCalling
{
    public static void main(String args[])
    {
        int cost = 12;
        Method obj = new Method();
        obj.musicPlayer();
        String str = obj.givemePen(cost);
        System.out.println(str);
    }
}