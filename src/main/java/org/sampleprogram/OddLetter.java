package org.sampleprogram;
public class OddLetter {
    public static void main(String[] args) {
        String word = "PROGRAM";
        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j || i + j == length - 1) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




