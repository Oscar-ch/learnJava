/**
 * 文档注释：程序使用说明书。可以通过java.doc提取，生成说明书。
 */

/*
需求：练习一个hello world程序。

思路：
    1.定义一个类，因为Java程序都是以类的形式存在，类的形式其实就是一个字节码文件最终体现
    2.定义一个主函数。为了让该类可以独立运行
    3.因为要演示hello world，在控制台看到该字样，所以需要输出语句完成

步骤：
    1.用class关键字完成类的定义，并对类名标识符起一个便于阅读的名字
    2.主函数：public static void main(String[] args)为固定格式，jvm只认这个入口。
    3.使用输出语句：System.out println("hello world");

代码仅仅是思想的一种体现形式！
*/

class Demo{//类名首字母大写
    //主函数，是程序的入口，被虚拟机所调用，保证一个类可以独立运行
    public static void main(String[] args){
        System.out.println("hello world");//输出语句，将括号中的内容打印到控制台，ln是用于换行的
    }
}