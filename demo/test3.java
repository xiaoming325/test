package com.it.demo;
/*
throw关键字
作用：
可以使用throw关键字在指定的方法中抛出指定的异常
使用格式：
throw new xxxException("异常产生的原因");
注意：
1、throw关键字必须写在方法内部
2、throw关键字后new的对象必须是Exception或其子类对象
3、throw关键字抛出指定的异常对象，必须处理这个异常对象
throw关键字后边创建的是编译异常，必须处理这个异常
 */
public class test3 {
    public static void main(String[] args) {
        //int [] arr=null;
        int[] arr=new int[3];
        int e = getElement(arr,0);
        System.out.println(e);
    }
    //NullPointerException是一个运行期异常，交给jvm处理
    //ArrayIndexOutOfBoundsException是一个运行期异常，交给jvm处理
    public static int getElement(int[] arr,int index) {
        /*可以对传递过来的参数数组，进行合法校验
        如果数组arr的值是null
        那么我们就抛出空指针异常，告知方法的调用者传递的数组的值是null
         */
        if(arr==null){
            throw new NullPointerException("传递的数组的值是null");
        }
        /*
        可以对index进行合法性校验
        如果范围不在索引范围内
        就告知
         */
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出数组的使用范围");
        }
        int ele=arr[index];
        return ele;
    }
}
