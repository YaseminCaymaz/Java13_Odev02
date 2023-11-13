package com.yasemin;

import java.util.Scanner;

/**
 * Soru: Harf Karakteri mi Sayı mı?
 * Kullanıcıdan bir karakter girişi alın. Ardından, girilen karakterin harf mi yoksa sayı mı olduğunu kontrol eden bir Java programı yazın.
 */
public class Runner_IfElse_08 {
    public static void main(String[] args) {
        System.out.println("Lütfen bir karakter giriniz..:");
        char karakter=new Scanner(System.in).next().charAt(0);
        if(karakter=='0' || karakter=='1' || karakter=='2' || karakter=='3' || karakter=='4' || karakter=='5' || karakter=='6' || karakter=='7'
                || karakter=='8' || karakter=='9' )
            System.out.println("Girilen karakter bir sayıdır.Karakter..:"+karakter);
        else
            System.out.println("Girilen karakter bir harftir.Karakter..:"+karakter);
    }
}
