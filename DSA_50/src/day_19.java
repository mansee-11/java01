//basic calculator

import java.util.Scanner;
public class day_19 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        double result = 0;
        int a = 0, b = 0;
        char op = ' ';

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                op = ch;
                a = Integer.parseInt(input.substring(0, i));
                b = Integer.parseInt(input.substring(i + 1));
                break;
            }
        }

        // Perform calculation
        if(op == '+') {
            result = a + b;
        }
        else if(op == '-') {
            result = a - b;
        }
        else if(op == '*') {
            result = a * b;
        }
        else if(op == '/') {
            result = a / (double)b;
        }

        System.out.println(input + " = " + Math.round(result));
    }
}
