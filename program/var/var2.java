/*
这是一个演示变量运算的程序
 */
class VarDemo2{
    public static void main(String[] args){
    /*
        int x = 3;
        //x = x + 5;//运算两端类型不同，不能运算，但是数值类型特殊
        byte b = 5;
        x = b + x;//自动类型转换

        byte c = 3;
        c = (byte)(c+4);//强制类型转换，可能丢失精度

        System.out.println(x);
        System.out.println(c);
        System.out.println('a'+0);//ASCI码 A是65，a是97,严格来说，Java是unicode表，国际标准码表。
        System.out.println('我'+0);//GBK码
    */
        byte b = 4;
        // b = 3+7;
        byte b1 = 3;
        byte b2 = 7;
        b = b1 + b2;//这样会报损失精度，为什么？请写出原因。b1,b2是变量，数值不确定，如果两个是127，则会丢失精度

        int x = 4;
        int x1 = Integer.MAX_VALUE;
        int x2 = 98;
        x = x1 + x2;//这样却不会报错损失精度，为什么？因为int是默认类型

        System.out.println(b);
    }
}