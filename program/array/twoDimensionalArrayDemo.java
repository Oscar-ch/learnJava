/*
这是一个演示二维数组的程序
*/

class TwoDimArray{

    public static void main(String[] args){

        int[][] arr1 = new int[3][2];//创建一个二维数组，该数组中有3个一维数组，每一个一维数组中有2个元素

        System.out.println(arr1);//直接打印二维数组
        System.out.println(arr1[0]);//直接打印二维数组中索引为0的一维数组
        System.out.println(arr1[0][0]);//打印二维数组中的索引为0的一维数组中索引为0的元素

        int[][] arr2 = new int[3][];

        System.out.println(arr2);//直接打印二维数组
        System.out.println(arr2[0]);//null
        //System.out.println(arr[0][0]);//报错NullPointerExcption

        int[][] arr3 = new int[3][2];

        System.out.println(arr3.length);//打印二维数组的长度，其实就是一维数组的个数
        System.out.println(arr3[1].length);//二维数组中索引为1的一维数组的长度

        int[][] arr4 = {{3,1,7},{8,5},{3,-5}};
        int sum = 0;
        //二维数组如何遍历
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                //System.out.print(arr4[i][j]+",");
                sum += arr4[i][j];
            }
        }

        System.out.println("sum = "+sum);

        //二维数组的应用场景
        //甲：1 2 3 5 8 1
        //乙： 5 8 9 3 4 1
        //……


    }
}