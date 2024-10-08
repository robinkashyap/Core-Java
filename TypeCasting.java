class Conversion{
    public static void main(String args[]){
        byte b = 127;
        System.out.println(b);

        int a = 12;
        // byte c = a // it gave error
        byte c = (byte) a;
        System.out.println(c);

        int d = 260;
        byte e = (byte) d; // 260%256 as byte range is from -128 to 127 so this will divide the int with byte range and give remainder as answer
        System.out.println(e);

        byte f = 10;
        byte g = 30;
        int result = f * g;  // Type promotions - here byte * byte are going out of range so it got type promotions
        System.out.println(result);
    }
}