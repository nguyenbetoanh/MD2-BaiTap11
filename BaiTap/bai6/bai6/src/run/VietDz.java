package run;

import java.util.Scanner;
import java.util.Stack;

public class VietDz {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy đưa phép tính vào để kiểm tra");
        String inputSt= scanner.nextLine();
        int count1 =0;
        int count2=0;
        char [] chars = inputSt.toCharArray();
        for (int i = 0; i < chars.length; i++) {
             if (chars[i]=='('){
                 count1++;
             }if (chars[i]==')'){
                 count2++;
            }
        }
        if (count1==count2){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }
    }
}
