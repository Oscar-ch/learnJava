/*
求数组最大值
*/

class ArrayToolDemo{
    //创建主函数
    public static void main(String [] args) {

        int[] arr = {4,1,8,9,7,6};
        int maxIndex = 0;

        //遍历数组查找最大值
        //第一种实现方式，直接在主函数中实现
        // for(int x = 1; x < arr.length; x++) {

        //     if(arr[x] > arr[maxIndex])
        //         maxIndex = x;//将较大值的索引值赋值给maxIndex
        // }

        //int max = getMax(arr);
        //System.out.println("Max = " + arr[maxIndex]);

        ArrayTool tool = new ArrayTool();
        int max = tool.getMax(arr);
        int index = tool.getIndex(arr, 10);

        System.out.println("max = " + max);
        System.out.println("index = " + index);
    }

    //遍历数组查找最大值
    //第二种实现方式，函数复用
    static int getMax(int[] arr) {
        //初始化最大值的索引
        int maxIndex = 0;

        //遍历数组查找最大值
        for(int x = 1; x < arr.length; x++) {
            //将较大值的索引值赋值给maxIndex
            if(arr[x] > arr[maxIndex])
                maxIndex = x;
        }
        return arr[maxIndex];
    }
}



//第三种实现方式，函数复用
class ArrayTool{
    //
    //遍历数组查找最大值
    public static int getMax(int[] arr) {
        //初始化最大值的索引
        int maxIndex = 0;

        //遍历数组查找最大值
        for(int x = 1; x < arr.length; x++) {
            //将较大值的索引值赋值给maxIndex
            if(arr[x] > arr[maxIndex])
                maxIndex = x;
        }
        return arr[maxIndex];
    }

    public static void selectSort(int[] arr) {
    //选择排序
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                 if(arr[i] > arr[j])
                    swap(arr,i,j);
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
    //交换数组元素
         int temp = arr[a];
         arr[a] = arr[b];
         arr[b]  = arr[a];
    }

    public static int getIndex(int[] arr , int key) {
    //获取数组中对应值的索引
        for(int x = 0; x < arr.length; x++) {

            if(arr[x] == key)
                return x;
        }
        return -1;
    }

    public static String arrayToString(int[] arr) {
    //打印字符串
        String str = "";

        for(int x = 0; x < arr.length; x++) {
        //遍历打印
            if(x != arr.length-1)
                str +=arr[x] + ",";
            else
                str +=arr[x] + "]";
        }
        return str;
    }
}