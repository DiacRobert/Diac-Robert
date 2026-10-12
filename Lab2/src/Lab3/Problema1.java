package Lab3;

import jdk.dynalink.Operation;

public class Problema1 {
    public static void main(String[] args) {
        String[] operatori = "+-*/%/".split("");
        switch(operatori){
            case 1:
                System.out.println("+");
                break;
            case 2:
                System.out.println("-");
                break;
            case 3:
                System.out.println("*");
                break;
            case 4:
                System.out.println("/");
                break;
            case 5:
                System.out.println("%");
                break;
        }
        System.out.println();
    }
}
