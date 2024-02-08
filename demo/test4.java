package com.it.demo;

import java.util.Objects;

/*
Object类中的静态方法
public staic <T> requireNonNull(T obj):查看指定引用对象不是null
源码：
public staic <T> T requireNonNull(T obj){
if(obj==null)
throw new NullPointerException();
return obj;
}
 */
public class test4 {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法判断
        /*if(obj==null){
            throw new NullPointerException("传递的对象值为null");
        }*/

        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj,"传递的对象值为null");
    }
}
