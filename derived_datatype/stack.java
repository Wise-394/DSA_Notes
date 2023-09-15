package derived_datatype;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<String> stackVar = new Stack<>();
        stackVar.push("evangeline");
        stackVar.push("garcia");
        stackVar.push("lomibao");

        while (true) {
            System.out.println(stackVar);
            System.out.println("type \"pop\" or \"push\" or \"exit\" ");
            String input = scn.nextLine();
            if (input.equalsIgnoreCase("pop")) {
                stackVar.pop();
            } else if (input.equalsIgnoreCase("push")) {
                System.out.println("enter string to push: ");
                String stackToPush = scn.nextLine();
                stackVar.push(stackToPush);
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                break;
            }
        }
        System.out.println(stackVar);
    }
}
