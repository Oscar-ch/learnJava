/*
这是一个演示变量运算的程序
 */
class VarDemo2{
    public static void main(String[] args){
        int x = 3;
        //x = x + 5;//运算两端类型不同，不能运算，但是数值类型特殊
        byte b = 5;
        x = b + x;//自动类型转换

        byte b = 3;
        b = (byte)(b+4);//强制类型转换，可能丢失精度

        System.out.println(x);
    }
}