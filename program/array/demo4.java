/*
这是一个演示数组查找的程序

面试题：
    给定一个有序的数组，如果往该数组中存储一个元素，并保证这个数组还是有序的，那么这个元素存储的角标如何获取

    二分查找改为return min
*/
import java.util.Arrays;
class ArrayDemo4{

    public static void main(String[] args){

        //int[] arr ={1,5,3,5,7789,1,2,6,465,9,6,8};
        int[] arr = {1,3,5,9,12,15,16,19,21};

        int index = halfSearch_2(arr,3);

        System.out.println(index);

        //真实开发时，不用自己写方法
        int index1 = Arrays.binarySerch(arr,45);//如果存在，返回索引值，如果不存在，返回插入点，-min-1
        System.out.println(index1);

    }

//遍历查找
    public static boolean getIndex(int[] arr,int key,int[] index){

        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                index[num] = i;
                num++;
            }
        }

        if(num>0)
            return true;
        else
            return false;
    }

//折半查找,二分查找，要求有序
    public static int halfSearch(int[] arr, int key){

        int max = arr.length-1,min = 0;
        int mid  = (max+min)/2;

        while(arr[mid] != key){

            if(arr[mid] < key)
                min = mid+1;
            else if(arr[mid] > key)
                max = mid-1;

            if(min > max)
                return -1;

            mid = (max+min)/2;
        }

        return -mid-1;
    }

//折半查找的另一种写法
    public static int halfSearch_2(int[] arr,int key){

        int max = arr.length-1,min = 0;
        int mid = (max+min)/2;

        while(min<=max){

            mid = (max+min)>>1;

            if(arr[mid] < key)
                min = mid+1;
            else if(arr[mid] > key)
                max = mid-1;
            else
                return mid;
        }

        return -1;
    }



}