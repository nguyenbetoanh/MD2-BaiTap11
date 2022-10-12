package run;

import java.util.Scanner;
import java.util.Stack;

public class StackRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập số cần chuyên");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> towShit = new Stack<>();

        while (number/2!=0){
            int x = number%2;
            towShit.push(x);
            number= number/2;
        }
        towShit.add(number);
        while (!towShit.isEmpty()){
            System.out.print(towShit.pop());
        }
    }
}
