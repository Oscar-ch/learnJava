/*
这是一个演示排序的程序
*/

class ArrayDemo3{

    public static void main(String[] args){

        int[] arr = {567,545,11,5,-8,1247,458,12,5,8,3,5,45};

        printArray(arr);

        //selectSort(arr);

        bubbleSort(arr);

        printArray(arr);

    }


//选择排序
    public static void selectSort(int[] arr){

        for(int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   swap(arr,i,j);
                }
            }
        }
    }

//选择排序的优化
 public static void selectSort_2(int[] arr){

        for(int i=0;i<(arr.length-1);i++){

            int num = arr[i];
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(num>arr[j]){
                    num = arr[j];
                    index = j
                }
            }
            if(index != i)
                swap(arr,i,index );
        }
    }

//冒泡排序
    public static void bubbleSort(int[] arr){

        int temp = 0;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){//-1是为了避免越界，-i
                if(arr[j]>arr[j+1]){
                   swap(arr,j,j+1);
                }
            }
        }
    }

//打印数组
    public static void printArray(int[] arr){

        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i != arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.print(arr[i]+"]");
        }

        System.out.println();
    }

//交换数组元素
    public static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}