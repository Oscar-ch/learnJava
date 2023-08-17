/*
这是用于演示数组的程序

数组在java中的定义：
    元素类型[] 数组名 = new 元素类型[元素个数或数组长度]; 需要一个容器，但不明确数据

    元素类型[] 数组名 = new 元素类型p4[] {元素，元素，……};需要一个容器存储已知数据

    元素类型[] 数组名 = {元素，元素，……};与上一种有一点细微的差别，在哪呢？

*/

class ArrayDemo{

    public static void main(String[] args) {
        //数组的不同定义方式
       int[] arr = new int[3];//必须明确长度,默认赋值0
       int[] arr2 = new int[]{89,34,5,8};
       int[] arr3 = {89,34,5,8};

       arr[0] = 9;//取数组中的值的方式，数组名[索引]

        System.out.println(arr[0]);
        System.out.println(arr);

        //对数组进行遍历
        for(int i=0;i<arr3.length;i++){
            System.out.println("arr3["+i+"] ="+arr3[i]);
        }
    }
}
