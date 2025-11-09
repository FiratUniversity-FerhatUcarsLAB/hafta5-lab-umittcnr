/*
 * Ad Soyad: [ADINIZI BURAYA YAZIN]
 * Ogrenci No: [OGRENCI NUMARANIZI BURAYA YAZIN]
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */
import java.util.Scanner;

//Kullanıcıdan gerekli bilgileri al ve tanımla

public class FizikFormulAsistani {
    static final double gravity = 9.8;
    //METOT 1: Hız hesapla (v = s / t)
    public static double Hizhesapla (double m,double zaman) {
        return m/zaman;
    }
    //METOT 2: İvme hesapla (a = Δv / t)
    public static double İvmehesapla (double deltaV,double zaman) {
        return deltaV/zaman;
    }
    //METOT 3: Kuvvet hesapla (F = m * a)
    public static double Kuvvethesapla (double kg,double a ) {
        return kg*a;
    }
    // METOT 4: İş hesapla (W = F * d)
    public static double ishesabı (double Kuvvethesapla,double zaman) {
        return Kuvvethesapla/zaman;
    }
    // METOT 5: Güç hesapla (P = W / t)
    public static double guchesabı (double ishesabı,double zaman ) {
        return ishesabı/zaman;
    }
    //METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double kinetikenerjihesabi (double kg,double Hizhesapla) {
        return 0.5*kg*Hizhesapla*Hizhesapla;
    }
    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double potansiyelenerjihesabi (double kg,double gravity, double yukseklik) {
        return kg*gravity*yukseklik;
    }
    // METOT 8: Momentum (p = m * v)
    public static double momentumhesabı (double kg,double Hizhesapla) {
        return kg*Hizhesapla;
    }

    // HESAPLAMALARI YAP - Metotlari cagir
    // 1. Hiz (v) hesaplanmali (KE ve Momentum icin gerekli)
    // 2. Ivme (a) hesaplanmali (Kuvvet icin gerekli)
    // 3. Kuvvet (F) hesaplanmali (Is icin gerekli)
    // 4. Is (W) hesaplanmali (Guc icin gerekli)
    // ... digerlerini hesaplayin

    public static void main(String[] args) {
        System.out.println("=== FIZIK FORMUL ASISTANI ===");
        Scanner input = new Scanner(System.in);
        System.out.print("Kutle (kg) değeri giriniz");
        double kg = input.nextDouble();
        System.out.print("Mesafe (m) değeri giriniz");
        double m = input.nextDouble();
        System.out.print("Zaman (s) değeri giriniz");
        double zaman = input.nextDouble();
        System.out.print("Hiz degisimi (m/s) değeri giriniz");
        double deltaV = input.nextDouble();
        System.out.print("Yukseklik (m) değeri giriniz");
        double yukseklik = input.nextDouble();
        double a = deltaV/zaman;
        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("        HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        double hiz = Hizhesapla(m,zaman);
        System.out.printf("  Hiz (v = s/t)             : %.2f m/s\n", hiz);
        double ivme = İvmehesapla(deltaV,zaman);
        System.out.printf("  Ivme (a = Δv/t)           : %.2f m/s²\n", ivme);
        System.out.println("\nKUVVET ve IS:");
        double kuvvet = Kuvvethesapla(kg,a);
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", kuvvet);
        double is = ishesabı(kuvvet,zaman);
        System.out.printf("  Is (W = F*d)              : %.2f J\n", is);
        double guc = guchesabı(is,zaman);
        System.out.printf("  Guc (P = W/t)             : %.2f W\n%n", guc);
        System.out.println("\nENERJI:");
        double kinetikenerji= kinetikenerjihesabi(m,hiz);
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kinetikenerji);
        double potansiyelenerji= potansiyelenerjihesabi(kg,gravity,yukseklik);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potansiyelenerji);
        // Toplam enerji = KE + PE
        System.out.printf("  Toplam Enerji              : %.2f J\n", (kinetikenerji + potansiyelenerji));

        System.out.println("\nMOMENTUM:");
        double momentum = momentumhesabı(kg,deltaV);
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");
    }


}
