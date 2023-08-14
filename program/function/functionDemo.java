/*
这是一个演示函数的程序

定义函数的格式
修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2，...）{
    执行语句；
    return 返回值；

}
*/

class FunctionDemo{

    public static void main(String[] args){
      // Error:无法从静态上下文中引用非静态 方法 add(int,int)

        System.out.println(add(3,4));
        myPrint();
    }

    static int add(int a,int b){
        return a+b;
    }
/*
特殊情况:
功能没有具体的返回值。

这时return的后面直接用分号结束。
返回值类型如何体现呢？因为没有具体值，所以不可以写具体的数据类型
在java中只能用一个关键字来表示这种情况，关键字是：void

总结：没有具体返回值时，返回值类型用void表示。
*/

    public static void myPrint(){
        System.out.println("hello java");
        return;//因为是void,所以可以省略不写
    }

}