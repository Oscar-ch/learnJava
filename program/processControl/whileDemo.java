/*
演示循环结构的程序
*/

class WhileDemo{

    public static void main(String[] args){
       //while语句示例
        int x = 1;
        while(x<3){
            System.out.println("x = "+x);
            x++;
        }

        //do while语句示例
        x = 8;
        do{
            System.out.println("x = "+x);
            x++;
        }while(x<3);
    }
}