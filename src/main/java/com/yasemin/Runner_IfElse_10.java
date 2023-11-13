package com.yasemin;

import java.util.Scanner;

/**
 * Mevsim Belirleme:
 * Kullanıcıdan bir ay alın. Bu ayın hangi mevsime ait olduğunu kontrol eden bir program yazın.
 */
public class Runner_IfElse_10 {
    public static void main(String[] args) {
        String yaz="Haziran, Temmuz, Agustos";
        String sonbahar="Eylül, Ekim, Kasım";
        String kis="Aralık, Ocak, Subat";
        String ilkbahar="Mart, Nisan, Mayis";
        System.out.println("Lütfen ayı giriniz..:");
        String name=new Scanner(System.in).nextLine();
        if(yaz.contains(name))
            System.out.println(name+" yaz mevsimine aittir.");
        else if (sonbahar.contains(name))
            System.out.println(name+" sonbahar mevsimine aittir.");
        else if (kis.contains(name))
            System.out.println(name+" kış mevsimine aittir.");
        else if (ilkbahar.contains(name))
            System.out.println(name+" ilkbahar mevsimine aittir.");
        else
            System.out.println("Girdiğiniz ifade hatalıdır.");


    }
}
