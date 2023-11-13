package com.yasemin;

import java.util.Scanner;

/**
 * Pozitif, Negatif veya Sıfır Kontrolü:
 * Kullanıcıdan bir sayı alın. Girilen sayının pozitif mi, negatif mi yoksa sıfır mı olduğunu kontrol eden bir program yazın.
 */
public class Runner_IfElse_01 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayı giriniz...:");
        int sayi=new Scanner(System.in).nextInt();
        if(sayi==0)
            System.out.println(sayi+" sıfıra eşittir");
        else if (sayi<0)
            System.out.println(sayi+" negatif bir sayıdır");
        else
            System.out.println(sayi+" pozitif bir sayıdır.");

    }
}
