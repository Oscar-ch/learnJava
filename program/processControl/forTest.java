/*
1.用for完成1-10的累加


2.用嵌套for结构打印：
   *
  ***
 *****
*******
 *****
  ***
   *
思路：
1.一共需要打印7行，即一层循环7次
2.先打印空格次数:3，2，1，0，1，2，3
3.再打印*号次数：1，3，5，7，5，3，1  5-2*(i-3)
*/

class ForTest{

    public static void main(String[] args){
        //用for完成累加
        int sum=0;
        for(int i=1;i<11;i++)
            sum += i;
        System.out.println("sum = "+sum);//输出累加结果

        //嵌套for循环打印
        for(int i=0;i<8;i++){//打印7行

            if(i<4){//对前四行进行打印

                for(int j=3;j>i;j--)//打印空格
                    System.out.print(" ");

                for(int k=0;k<(2*i+1);k++)//打印*
                    System.out.print("*");
                System.out.println();
            }

            if(i>3){//对后3行进行打印

                for(int j=0;j<((i+1)%4);j++)//打印空格
                    System.out.print(" ");

                for(int k=0;k<(13-2*i);k++)//打印*
                    System.out.print("*");
                System.out.println();
            }
        }

        //打印九九乘法表
        for(int i = 1;i<10;i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print(j+" * "+i+"= "+(j*i)+" ");
            }
            System.out.println();
        }
    }
}