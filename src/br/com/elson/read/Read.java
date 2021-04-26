package br.com.elson.read;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String myString = input.next();
        int myInt=input.nextInt();
        //input.close();

        System.out.println("myString is"+ myString);
        System.out.println("myInt is"+ myInt);
    }

}
