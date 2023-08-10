/*
这是用于演示算术运算符的程序
 */
class OperateDemo{
    public static void main(String[] args){
        //算术运算符 + - * / %（取余，模运算）
        int x = 4562;
        x = x /1000 * 1000;//显示结果是4000，为什么呢？
        System.out.println(x);

        //连接符 +
        System.out.println(3+"2");//输出32
        System.out.println("5+5="+5+5);//输出5+5 = 55
        System.out.println("5+5="+(5+5));//输出5+5 = 10

        int a = 3,b = 4;
        System.out.println("a = " + a + "," + ",b = " + b);

        //++,--
        //++a;  //a = a+1;
        b = a++;//a先将值存储到一个临时区域，然后完成自加后，将预存的值赋值给b;
        System.out.println("a = " + a + "," + ",b = " + b);
        //面试题
        int i = 3;
        i = i++;
        System.out.println("i = "+i);//输出i=3，为什么？
    }

}