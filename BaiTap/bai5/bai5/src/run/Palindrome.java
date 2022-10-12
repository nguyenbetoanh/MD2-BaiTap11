package run;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hay nhap chuoi can kiem tra vao");
        String word = sc.next();
        boolean check =false;
        char[] listword = word.toCharArray();
        for (int i = 0; i < word.length() / 2; i++) {
            if (listword[i] == listword[listword.length - 1 - i]) {
                check =true;
            } else {
                System.out.println("ko là chuỗi");
                break;

            }
        }
        if (check){
            System.out.println("la chuoi");
        }

    }
}
