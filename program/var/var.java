/*
这是用于演示变量的一个程序
*/

class VarDemo{
    public static void main(String[] args){
    //数据类型 变量名 = 初始化值;
    byte b = 3;//在内存中开辟了一个空间，名称为b，初始化定义值为3
    short s = 4000;
    int x = 12;
    long l = 12345678;

    float f = 2.3f;//因为2.3默认是一个双精度数，所以需要强制转换成单精度数

    double d = 3.4;

    char ch = 'a';

    boolean bl = true;
    bl = false;

    System.out.println("初始化了一个整型变量b:"+b);
    // System.out.println(ch);
    // System.out.println(bl);
    }
}