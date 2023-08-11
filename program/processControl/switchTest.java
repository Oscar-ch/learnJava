/*
需求：
用户输入的数据对应出星期
用户输入的数据对应出季节
*/

class SwitchTest{

    public static void main(String[] args){
        //星期
        int week = 5;
        switch(week){
            case 1:
                System.out.println("这是星期一");
                break;
            case 2:
                System.out.println("这是星期二");
                break;
            case 3:
                System.out.println("这是星期三");
                break;
            case 4:
                System.out.println("这是星期四");
                break;
            case 5:
                System.out.println("这是星期五");
                break;
            case 6:
                System.out.println("这是星期六");
                break;
            case 7:
                System.out.println("这是星期日");
                break;
            default:
                System.out.println("没有找到对应的星期");
                break;
        }
        //季节的示例
        int month = 8;
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println(month+"月是春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month+"月是夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month+"月是秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(month+"月是冬季");
                break;
            default:
                System.out.println("输入的不是一个月份");
                break;
        }
    }
}