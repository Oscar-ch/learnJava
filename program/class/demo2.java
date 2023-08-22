/*
演示数据类型传递的程序
*/

// class Demo{
//     //基本数据类型参数传递
//     public static void main(String[] args) {
//         //主函数入口
//         int x = 3;
//         show(x);
//         System.out.println("x="+x);//x打印的值是几？
//     }

//     public static void show(int x) {

//         x = 4;
//     }
// }

class Demo{

    int x = 3;

    public static void main(String[] args) {
        //引用数据类型参数传递
        Demo d = new Demo();
        d.x = 9;
        show(d);
        System.out.println(d.x);
    }

    public static void show(Demo d) {

        d.x = 4;
    }
}