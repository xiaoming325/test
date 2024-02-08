package com.it.demo;
//异常产生过程的分析
public class test2 {
    public static void main(String[] args) {
        //创建数组并赋初值
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3);
        System.out.println(e);
    }
     /*
    定义一个方法，获取数组指定索引处的元素
    参数：
    int[] arr
    int index
     */
    public static int getElement(int [] arr,int index){
       int ele = arr[index];
       return ele;
    }
}
