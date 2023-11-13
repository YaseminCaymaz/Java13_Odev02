package com.yasemin;

import java.util.Scanner;

/**
 * Gün İsimleri:
 * Kullanıcıdan 1-7 arasında bir sayı alın. Bu sayıya karşılık gelen gün ismini yazdıran bir program yazın.
 */
public class Runner_IfElse_07 {
    public static void main(String[] args) {
        System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz..:");
        int sayi=new Scanner(System.in).nextInt();
        if (sayi==1)
            System.out.println("Sayıya karşılık gelen gün Pazartesi");
        else if (sayi==2)
            System.out.println("Sayıya karşılık gelen gün Salı");
        else if (sayi==3)
            System.out.println("Sayıya karşılık gelen gün Carşamba");
        else if (sayi==4)
            System.out.println("Sayıya karşılık gelen gün Perşembe");
        else if (sayi==5)
            System.out.println("Sayıya karşılık gelen gün Cuma");
        else if (sayi==6)
            System.out.println("Sayıya karşılık gelen gün Cumartesi");
        else if (sayi==7)
            System.out.println("Sayıya karşılık gelen gün Pazar");
        else
            System.out.println("Hatalı bir sayı girdiniz.");


    }
}
