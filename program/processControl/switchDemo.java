/*
用于演示switch语句
*/

class SwitchDemo{

    public static void main(String[] args){
        /*
        switch(表达式){
            case 取值1：
                执行语句；
                break;
            case 取值2：
                执行语句；
                break;
            ……
            default
                执行语句；
                break;
        }
        */

       int x = -3;

       switch(x){//byte,short,int,char
        case 4:
            System.out.println("a");
            break;
        case 0:
            System.out.println("b");
            break;
        case -3:
            System.out.println("c");
            break;
        default:
            System.out.println("d");
            break;
       }

       int a = 15 , b = 18;
       char ope = 'c';

       switch(ope){
        case '+':
            System.out.println(a+b);
            break;//结束switch语句，否则会继续顺序执行到break或者大括号终结
        case '-':
            System.out.println(a-b);
            break;
        case '*':
            System.out.println(a*b);
            break;
        case '/':
            System.out.println(a/b);
            break;
        default://default放最前也是最后执行
            System.out.println("无法识别进行运算");
       }
    }
}