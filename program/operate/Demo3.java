/*
演示比较运算符，逻辑运算符
*/

class OperateDemo3{

    public static void main(String[] args){
        //比较运算符
        System.out.println(3>2);//输出true
        //比较运算符输出结果是true或者false

        //逻辑运算符 如何实现2<x<5
        //逻辑运算符用于连接两个boolean类型的表达式
        int x = 3;
        System.out.println(x>2 & x <5);//输出true
        //^:异或，不同为真，相同为假
        //&& ，||与&，|的区别

        /*
        &&前假则假，||前真则真，短路与 和 短路或
        */
    }
}