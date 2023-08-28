package org.sampleprogram;

public class ReverseString {
    public static void main(String[] args) {
        String str = "selenium";
        String rev = "";
        int a = str.length() - 1;
        //1: using charAt method
        for (int i = a; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("the reveresed string is:" + rev);

        // using array concept
        char aa[] = str.toCharArray();
        int b = aa.length - 1;
        for (int i = b; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("the reveresed string is:" + rev);

        // using string builder
        StringBuilder sb = new StringBuilder(str);
        rev = rev + sb.reverse();
        System.out.println("the reveresed string is:" + rev);

        // using string buffer
        StringBuffer st1 = new StringBuffer(str);
        rev = rev + st1.reverse();
        System.out.println("the reveresed string is:" + rev);


    }
}
