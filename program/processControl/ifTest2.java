/*
一年有四季
春：3，4，5
夏：6，7，8
秋：9，10，11
冬：12，1，2
根据用户的输入的月份，给出对应的季节。
*/

class IfTest2{
    public static void main(String[] args){
        //提高代码的复用性，将多条件合并
        int month=4;

        if(month>=3 && month<=5){
            System.out.println(month+"春");
        }
        else if(month>=6 && month<=8){
            System.out.println(month+"夏");
        }
        else if(month>=9 && month<=11){
            System.out.println(month+"秋");
        }
        else if(month>=12 && month<=2){
            System.out.println(month+"冬");
        }
        else{
            System.out.println(month+"没有对应的季节");
        }
    }
}