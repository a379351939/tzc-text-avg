package com.play;


import java.util.Scanner;

public class TheInterface {
    public static void main(String[] args){
        System.out.println("the Interface");
        run();
    }
    private static void run(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        switch (line) {
            case "1":
                run();
                break;
            case "2":
                run();
                break;
            case "5":
                System.exit(0);
                break;

        }
    }

}