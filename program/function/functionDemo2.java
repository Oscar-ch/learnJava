/*
需求：1.定义一个功能完成两个整数和的获取

    思路：既然定义功能，就是可以用函数来体现
        如何定义一个函数？
        通过两个明确来完成?

    明确一：这个功能的结果是什么？是和，所以该功能的返回值类型是int
        其实就是在明确函数的返回值类型

    明确二：这个功能的实现过程中是否需要未知内容参与运算？由，加数和被加数
        其实就是在明确参数列表
*/

class FunctionDemo2{

    //主函数，执行入口
    public static void main(String[] args){

        // int a = 3,b=4;
        // draw(3,4);//测试绘画矩形的函数

        //int a =56,b = 88;
        //System.out.println(eaqual(a,b));//测试比较两数是否相等的函数
        //System.out.println(max(a,b));//测试取较大数的函数

        //print99();//测试打印九九乘法表

        int grade=89;
        if(level(grade) != '!')
            System.out.println(level(grade));
        else
            System.out.println("错误的输入");
    }

    //需求1，整数和
    public static int add(int a, int b){
        return a+b;
    }

    //需求2，画矩形
    public static void draw(int row,int col){

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    //需求3，比较两数是否相等
    public static boolean eaqual(int a,int b){

        // if(a == b)
        //     return true;
        // else//else可以省略
        //     return false;

        //return a==b?true:false;

        return a==b;
    }

    //需求4：定义一个功能，获取两个整数中较大的那个数。

    public static int max(int a,int b){

        // if(a <= b)
        //     return b;
        // else
        //     return a;

        return a<b?b:a;
    }

    //需求5：打印九九乘法表
    public static void print99(){

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"= "+i*j+"\t");
            }
            System.out.println();
        }

        int temp=9;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=temp;j++){
                System.out.print(j+"*"+i+"= "+i*j+"\t");
            }
            temp--;
            System.out.println();
        }
    }

    /*
    需求6：根据考试成绩获得对应等级
        90-100  A
        80-89   B
        70-79   C
        60-69   D
        60以下  E
    */
   public static char level(int grade){

        if(grade>=90 && grade <= 100)
            return 'A';
        else if(grade>=80 && grade <= 89)
            return 'B';
        else if(grade>=70 && grade <= 79)
            return 'C';
        else if(grade>=60 && grade <= 69)
            return 'D';
        else if(grade>=0 && grade <= 60)
            return 'E';
        else
            return '!';//错误回报
   }
}