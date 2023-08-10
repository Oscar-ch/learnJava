/*
需求：根据用户指定的具体数据，判断该数据对应的星期
1-星期几-Monday

思路：
用户输入无法获取，而我们要做的功能是仅仅是对用户指定的数据进行对应星期的打印
所以具体的数据不确定，完全可以使用变量来表示。变量的值由用户决定。

因为数据的不确定性，要对数据进行判读，故使用if语句
*/

class IfTest{
    public static void main(String[] args){
        int week = 4;

        if(week==1)
            System.out.println(week+"是星期一");
        else if(week==2)
            System.out.println(week+"是星期二");
        else if(week==3)
            System.out.println(week+"是星期三");
        else if(week==4)
            System.out.println(week+"是星期四");
        else if(week==5)
            System.out.println(week+"是星期五");
        else if(week==6)
            System.out.println(week+"是星期六");
        else if(week==7)
            System.out.println(week+"是星期日");
        else
            System.out.println(week+"没有对应的星期");
    }
}