/*
找出数组中的最值

思路：
1.需要进行比较，并定义变量记录住每次比较后较大的值
2.对数组中的元素进行遍历取出，和变量中记录的元素进行比较和覆盖
3.遍历结束，该变量记录就是最大值

定义一个功能来实现
明确一，结果
    是数组中的元素
明确二，未知内容
    数组
*/

class ArrayDemo2{

    public static void main(String[] args){

            int[] arr = {1,5,8,3,4,5,8,2,6,8,2,4,11};

            System.out.println(getMax(arr));

    }

    //遍历查找
    public static int getMax(int[] a){

        int max = a[0];//定义变量中的较大值

        for(int i=1;i<a.length;i++){
            if(max < a[i])
                max = a[i];
        }

        return max;
    }
}


