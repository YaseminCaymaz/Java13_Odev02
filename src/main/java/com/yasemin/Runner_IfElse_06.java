package com.yasemin;

import java.util.Scanner;

/**
 * Yaşa Göre Oyuncak Seçimi:
 * Kullanıcıdan bir yaş bilgisi alın. Yaşa göre uygun bir oyuncak seçen bir program yazın
 * (örneğin, 0-3 yaş arası bebeklere oyuncak bebek, 4-6 yaş arası çocuklara oyun arabası).
 */
public class Runner_IfElse_06 {
    public static void main(String[] args) {
        System.out.println("Lütfen çocugun yaşını giriniz..:");
        int yas=new Scanner(System.in).nextInt();
        if (yas>0 && yas<=3)
            System.out.println("Bu yaşa uygun oyuncak oyuncak bebektir.");
        else if (yas<=6)
            System.out.println("Bu yaşa uygun oyuncak oyun arabasıdır.");
        else
            System.out.println("Bu yaşa uygun oyuncak puzzledır.");

    }
}
