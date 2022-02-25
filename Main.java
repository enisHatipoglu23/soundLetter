package com.company;

import java.util.Arrays;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++){
            if(word.contains("a")){
                System.out.println("AAA");
            }
            if(word.contains("e")){
                System.out.println("EEE");
            }
            if(word.contains("o")){
                System.out.println("OOO");
            }
            if(word.contains("ö")){
                System.out.println("ÖÖÖ");
            }
            if(word.contains("u")){
                System.out.println("UUU");
            }
            if(word.contains("ü")){
                System.out.println("ÜÜÜ");
            }
            if(word.contains("i")){
                System.out.println("İİİ");
            }
            if(word.contains("ı")){
                System.out.println("III");
            }
            break;
        }


    }
}
