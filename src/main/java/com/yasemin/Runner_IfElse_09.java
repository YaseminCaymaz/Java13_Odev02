package com.yasemin;

import java.util.Scanner;

/**
 * Kullanıcı Yetkilendirme:
 * Kullanıcıdan bir kullanıcı adı ve şifre alın. Doğru kullanıcı adı ve şifreyi kontrol eden bir program yazın.
 */
public class Runner_IfElse_09 {
    public static void main(String[] args) {
        String userName="Yasemin";
        int password=987654;
        System.out.println("Lütfen kullanıcı adınızı giriniz..:");
        String name=new Scanner(System.in).nextLine();
        System.out.println("Lütfen şifreyi giriniz..:");
        int sifre=new Scanner(System.in).nextInt();
        if (userName.equals(name) && password==sifre)
            System.out.println("Giriş yapıldı.");
        else
            System.out.println("Kullanıcı adı veya şifre yanliş");
    }
}
