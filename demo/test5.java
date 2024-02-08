package com.it.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throw关键字：异常处理的第一种方式，交给别人处理
作用：当方法内部抛出异常对象时，可使用throw关键字处理异常对象，会把异常对象声明抛出给方法的使用者处理，最终交给jvm处理
使用格式：在方法声明时使用
修饰符 返回类型值 方法名（参数列表）
注意：1、throws关键字必须写在方法声明处
2、throws关键字后声明的异常必须是Exception或其子类
3、方法内部如果出现多个异常对象，throws后必须也声明多个对象

 */
public class test5 {
    public static void main(String[] args) throws FileNotFoundException,IOException{
        readFile("c:\\a.txt");
    }
/*
定义一个方法，对传递文件路径进行合法性判断
如果路径不是c:\a.txt，就抛出文件找不到异常对象，告知调用者
注意：FileNotFoundException是编译异常，抛出了编译异常，就必须处理这个异常
可以使用throw继续声明抛出FileNotFoundException这个异常，让方法的调用者处理
 */
    public static void readFile(String fileName) throws FileNotFoundException,IOException{
        if(fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        /*
        如果传递的是路径，不是.txt结尾
        那么就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径没有问题，读取文件");
    }
}
