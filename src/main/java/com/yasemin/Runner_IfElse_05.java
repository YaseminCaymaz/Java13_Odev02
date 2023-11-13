package com.yasemin;

import java.util.Random;
import java.util.Scanner;

/**
 * En Büyük Sayıyı Bulma:
 * Rastgele  üç sayı girin. Bu sayılardan en büyüğünü bulan bir program yazın.
 */
public class Runner_IfElse_05 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi1=rnd.nextInt(1,500);
        int sayi2=rnd.nextInt(1,500);
        int sayi3=rnd.nextInt(1,500);
        System.out.println("1.sayı:"+sayi1+"  2.sayı:"+sayi2+"  3.sayı:"+sayi3);
        System.out.println("-----------------------------------");
        if(sayi1>sayi2 && sayi1>sayi3)
            System.out.println("EN BUYUK SAYI:"+sayi1);
        else if (sayi2>sayi3)
            System.out.println("EN BUYUK SAYI:"+sayi2);
        else
            System.out.println("EN BUYUK SAYI:"+sayi3);

    }
}
