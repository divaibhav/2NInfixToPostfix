package main;

import infix.postfix.InfixToPostFix;

public class MyMain {
    public static void main(String[] args) {
        InfixToPostFix convertor =
                new InfixToPostFix();
        String infix = "2^2^3";
        String postfix = convertor.infixPostfix(infix);
        System.out.println("postfix =>  " + postfix);
    }
}
