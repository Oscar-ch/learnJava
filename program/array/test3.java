/*
查表法的练习

星期
*/

class ArrayTest3{

    public static void main(String[] args){

        System.out.println(getWeek(3));

    }

    public static String getWeek(int num){

        if(num<1 || num >7)
            return "非法数据";
        String[] weeks = {"星期一","星期二","星期三",
                            "星期四","星期五","星期六","星期日"};

        return weeks[num-1];
    }
}