package org.sampleprogram;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev ="";
        int a = str.length()-1;

        for (int i=a;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("The given string is palindrome::"+rev);
        }
        else{
            System.out.println("The given string is not a palindrome::"+rev);
        }

        String str1="Rithika";
        String rev1="";
        char aa[] = str1.toCharArray();
        int b = aa.length-1;
        for (int i=b;i>=0;i--){
            rev1 = rev1+str1.charAt(i);
        }
        if (rev1.equals(str1)){
            System.out.println("palindrome::"+rev1);
        }
        else{
            System.out.println("not a palindrome::"+rev);
        }
    }
}
