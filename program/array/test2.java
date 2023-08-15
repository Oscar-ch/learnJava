/*
十进制转二进制、八进制、十六进制实现

该程序现在的问题：转换后应该返回数组，for循环打印只是权宜之计
*/

class ArrayTest2{

    public static void main(String[] args){

        toBinary(60);
        toHex(60);
        toOctal(60);
    }


    public static void toHex(int num){
        trans(num,15,4);
    }

    public static void toBinary(int num){
        trans(num,1,1);
    }

    public static void toOctal(int num){
        trans(num,7,3);
    }

    public static void trans(int num,int base,int offset){

        if(num==0){
            System.out.println("0");
            return;
        }

        //定义一个对应关系表x
        char[] chs = {'0','1','2','3',
                        '4','5','6','7',
                        '8','9','A','B',
                        'C','D','E','F'};
        /*
        一会查表会查到比较的数据
        数据一多，就先存储起来，再进行操作
        所以定义一个数组，临时容器
        */
        char[] arr = new char[32];
        int pos = arr.length-1;

        while(num!=0){
            int temp = num & base;
            arr[pos] = chs[temp];
            pos--;
            num = num >>> offset;
        }

        for(int i=pos;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
