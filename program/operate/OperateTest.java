/*
练习：
1.最有效的方式实习2*8
2.对两个整数变量的值进行互换（不需要第三方变量）
*/

class OperateTest{
    public static void main(String[] args){
        //2*8
        System.out.println(2<<3);

        //互换a,b的值
        int a = 8, b = 15;

        //最简单的方式是用第三方变量，开发时使用，因为阅读性强
       /*
        int temp;
        temp = a;
        a = b;
        b = temp;
        */

        //不要用这种方式，如果两个整数的数值过大，会超出int范围导致强制转换，数据会变化
        /*
        a = a + b;
        b = a - b;
        a = a - b;
        */


        //用异或,用于面试，因为阅读性差
        a = a ^ b;//a = a^b
        b = a ^ b;//b = a^b^b
        a = a ^ b;//a = a^b^a^b^b

        System.out.println("a = " + a +", b = "+ b);


    }
}