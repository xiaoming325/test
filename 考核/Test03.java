package comit;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        char[] brr = new char[1000];
        int[] count = new int[1000];

        for (int i = 0; i < brr.length; i++) {
            brr[i] = '\0';
        }

        find(arr, brr, count);
        print(brr, count);
    //排序并打印
        char[] crr = arr.toCharArray();
        Arrays.sort(crr);
        String finalString = new String(crr);
        System.out.println("排序后的字符串为"+finalString);
    }
//计算字符重复次数
    public static void find(String arr, char[] brr, int[] count) {

        for (int i = 0; i < arr.length(); i++) {
            char currentChar = arr.charAt(i);
            boolean found = false;

            for (int j = 0; j < brr.length; j++) {
                if (brr[j] == currentChar) {
                    count[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                for (int j = 0; j < brr.length; j++) {
                    if (brr[j] == '\0') {
                        brr[j] = currentChar;
                        count[j] = 1;
                        break;
                    }
                }
            }
        }
    }

    public static void print(char[] brr, int[] count) {
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] != '\0') {
                System.out.println("字符" + brr[i] + "出现的次数为" + count[i] + "次");
            }
        }
    }
}
