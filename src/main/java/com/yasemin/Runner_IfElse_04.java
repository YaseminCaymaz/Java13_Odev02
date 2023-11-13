package com.yasemin;

import java.util.Scanner;

/**
 * Vize-Final Not Ortalaması Hesaplama:
 * Kullanıcıdan vize ve final notlarını alın. Ortalama hesaplayarak, öğrencinin geçip geçmediğini kontrol eden bir program yazın.
 */
public class Runner_IfElse_04 {
    public static void main(String[] args) {
        System.out.println("Vize notunu giriniz..:");
        float vizeNotu=new Scanner(System.in).nextFloat();
        System.out.println("Final notunu giriniz..:");
        float finalNotu=new Scanner(System.in).nextFloat();
        float ortalama=(vizeNotu+finalNotu)/2;
        if (ortalama>=60)
            System.out.println("Dersten Geçtiniz.Ortalama..:"+ortalama);
        else
            System.out.println("Dersten kaldınız.Ortalama..:"+ortalama);

    }
}
