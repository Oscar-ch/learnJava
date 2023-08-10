/*
这个程序用于演示赋值运算符
*/

class OperateDemo2{
    public static void main(String[] args){
        //赋值运算符 = += -= *= /= %=
        int a = 4;
        a += 2;//左右两边相加的和赋予左边

        //面试题，这两句有什么区别？
        short s = 3;
        s += 4;//可以正常运算，因为实际是两次运算，有自动转换（强制转换）
        s = s+4;//报精度错误，从int转换到short可能会有损失
        System.out.println(s);
    }
}