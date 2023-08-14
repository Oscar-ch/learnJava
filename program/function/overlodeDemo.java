/*
这是一个演示函数的重载的程序

1.同一个类
2.同名
3.参数个数不同，类型不同
4.函数的重载和返回值类型无关
5.java是严谨性语言
*/

class OverloadFunction{

    public static void main(String[] args){

        // int a=1,b=2,c=3;
        // double x=5,y=9;

        // System.out.println(add(a,b));
        // System.out.println(add(a,b,c));
        // System.out.println(add(x,y));

        printCFB();
    }

    //两个整数加法
    public static int add(int a,int b){
        return a+b;
    }

    //两个小数加法
    public static  double add(double a,double b){
        return a+b;
    }

    //三个整数加法
    public static  int add(int a,int b,int c){
        return a+b+c;
    }

    //打印乘法表
    public static void printCFB(int num){

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j+"*"+i+"= "+j*i+"\t");
            System.out.println();
        }
    }

    //打印标准乘法表
    public static void printCFB(){

        printCFB(9);
    }
}