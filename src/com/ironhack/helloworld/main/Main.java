package com.ironhack.helloworld.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String productName = " this is an awesome product  ";
        String publishDate = " 31 de mayo de 2022  ";
        String productFormatted = productFormatter(productName, publishDate);

        System.out.println(productFormatted);


    }
    private static String productFormatter(String productName, String publishDate) {
        return productName.trim()
                .concat(" ")
                .concat(publishDate.trim())
                .replace(" ", "_")
                .toUpperCase();
    }

}









