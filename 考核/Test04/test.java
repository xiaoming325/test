package Test04;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Student[] arr = new Student[100];
        int i = 0, j = 0, num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生数量");
        num = sc.nextInt();
        for (i = 0; i < num; i++) {
            arr[i]=new Student();
            System.out.println("请输入姓名");
            arr[i].setName(sc.next());
            System.out.println("请输入性别");
            arr[i].setSex(sc.next());
            System.out.println("请输入成绩");
            arr[i].setGrade(sc.nextInt());
        }

        for (i = 0; i < num - 1; i++) {
            for (j = i + 1; j < num - i - 1; j++) {
                if (arr[i].getGrade() < arr[j].getGrade()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("从高到低学生排序如下：");
        toString(arr, num);
    }

    public static void toString(Student[] arr, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("姓名：" + arr[i].getName() + "性别：" + arr[i].getSex() + "成绩：" + arr[i].getGrade());
        }
    }
}
