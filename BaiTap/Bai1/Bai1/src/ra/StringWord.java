package ra;

import java.util.Stack;

public class StringWord {
    public static void main(String[] args) {
        Stack<String> word = new Stack<>();
        String str ="Hoc java that la vui hihi moi toi hoi met";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        for (int i = 0; i < chars.length; i++) {
            word.push(String.valueOf(chars[i]));
        }
        while (!word.isEmpty()){
            System.out.print(word.pop());
        }
    }
}
