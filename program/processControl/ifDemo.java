/*
演示判断结构的程序
*/

class IfDemo{
    public static void main(String[] args){
        /*
        if语句的第一种格式：
        1.  if(条件表达式){
            执行语句;
        }
        */

       int x = 3;
       if(x>1){
            System.out.println("yes");
       }
       System.out.println("over");

        /*
        if语句的第二种格式：
        1.  if(条件表达式){
                执行语句;
        }
            else{
                执行语句;
            }
        */
       x = 1;
       if(x>1){
            System.out.println("yes");
       }
       else{
            System.out.println("no");
       }

      // ???  void temp =  x>1?System.out.println("yes"):System.out.println("no");


       /*
        if语句的第二种格式：
        1.  if(条件表达式){
                执行语句;
            }
            else if{

            }
            else{
                执行语句;
            }
        */

       x = 3;
       if(x>1)
            System.out.println("a");
        else if(x>2)
            System.out.println("b");
        else if(x>3)
            System.out.println("c");
        else
            System.out.println("d");

        //错误示例
        if(false);//错误之处，多写了";"
        {//局部代码块可以定义局部变量的生命周期，可以节省内存空间
            System.out.println("hello world");
        }
    }
}