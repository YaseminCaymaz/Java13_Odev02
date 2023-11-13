package com.yasemin;

import java.util.Scanner;

/**
 * Üçgen Türü Belirleme:
 * Kullanıcıdan üç kenar uzunluğunu alın. Bu kenar uzunlukları ile oluşan üçgenin eşkenar,
 * ikizkenar veya çeşitkenar olduğunu kontrol eden bir program yazın.
 */
public class Runner_IfElse_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ücgenin 1. kenar uzunlugunu yazınız..:");
        int kenar1= sc.nextInt();
        System.out.println("Ücgenin 2. kenar uzunlugunu yazınız..:");
        int kenar2= sc.nextInt();
        System.out.println("Ücgenin 3. kenar uzunlugunu yazınız..:");
        int kenar3= sc.nextInt();
        if(kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3)
            System.out.println("Girilen kenar uzunlukları eşkenar üçgene aittir.");
        else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3)
            System.out.println("Girilen kenar uzunlukları ikizkenar üçgene aittir.");
        else
            System.out.println("Girilen kenar uzunlukları çeşitkenar üçgene aittir.");

    }
}
