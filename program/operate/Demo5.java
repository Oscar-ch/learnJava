/*
用于演示三元运算符
*/

class OperateDemo5{
    public static void main(String[] args){
        int x = 3,y;

        y =  (x>1)?100:200;
        System.out.println("y = "+y);

        //获取两个整数中的较大数
        int a,b;
        int max = a>b?a:b;

        //获取三个整数中的较大数
        int o,p,q;

        int temp = o>p?o:p;
        int max2 = temp>q?temp:q;
    }
}