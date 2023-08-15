/*
获取一个整数的16进制表现形式

什么时候用数组？
    如果数据出现了对应关系，且对应关系的一方是有序的数字编号，并作为索引使用.
    必须想到数组的使用,可以将这些数据存储到数组中，根据运算的结果作为角标直接去查数组中对应的元素即可

    这种方法称之为查表法
*/

class ArrayTest{

    public static void main(String[] args){
        toHex_1(60);

    }

    public static void toHex(int num){

        //定义一个对应关系表
        char[] chs = {'0','1','2','3',
                        '4','5','6','7',
                        '8','9','A','B',
                        'C','D','E','F'};

        for(int i=0;i<8;i++){

            int temp = num & 15;
            System.out.print(chs[temp]);
            num = num >>> 4;
        }
        System.out.println();
    }

    public static void toHex_1(int num){

        if(num==0){
            System.out.println("0");
            return;
        }

        //定义一个对应关系表
        char[] chs = {'0','1','2','3',
                        '4','5','6','7',
                        '8','9','A','B',
                        'C','D','E','F'};
        /*
        一会查表会查到比较的数据
        数据一多，就先存储起来，再进行操作
        所以定义一个数组，临时容器
        */
        char[] arr = new char[8];
        int pos = 0;

        while(num!=0){
            int temp = num&15;
            arr[pos] = chs[temp];
            pos++;
            num = num >>> 4;
        }

        System.out.println("points = "+pos);
        for(int i=pos;i>=0;i--){
            System.out.print(arr[i]);
        }

    }
}