package com.yasemin;

import java.util.Scanner;

/**
 * Çift veya Tek Sayı Kontrolü:
 * Kullanıcıdan bir sayı alın. Girilen sayının çift mi, tek mi olduğunu kontrol eden bir program yazın.
 */
public class Runner_IfElse_02 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz...:");
        int sayi=new Scanner(System.in).nextInt();
        if(sayi%2==0)
            System.out.println(sayi+" çift sayıdır.");
        else
            System.out.println(sayi+" tek sayıdır.");

    }
}
