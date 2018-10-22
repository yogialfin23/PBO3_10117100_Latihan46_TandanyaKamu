package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Age age = new Age();
        System.out.printf("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scn.nextInt());
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir Anda : "+age.getYearBirth());

        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                +age.hitungUmur()+" tahun");

        System.out.println("Tandanya Kamu : "+age.tandanyaKamu(age.hitungUmur()));
    }
}
