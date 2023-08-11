/*
for语句示例
for(初始化表达式；循环条件表达式；循环后的操作表达式){
    执行语句；（循环体）
}
*/

class ForDemo{

    public static void main(String[] args){
        //简单示例
        for(int i=1;i<3;i++){
            System.out.println("i = "+i);
        }

        for(System.out.println("a");;System.out.println("b")){//循环条件表达式输出需要是bollean值
            System.out.println("test");
            break;
        }

        //for(int a=0,b=5;;a++,b--)

        //for语言的嵌套结构
        int count = 0;
        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                System.out.println(++count);
    }
}