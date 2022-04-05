package com.company;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        String arr[] = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            arr[i] = sc.nextLine();
        }
        if(arr[0].equalsIgnoreCase(arr[1])){
            System.out.println("names are the same");
        }
        else{
            System.out.println("names are not the same");
        }
    }
}