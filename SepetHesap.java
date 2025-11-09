/*
 * Ad Soyad: [ÜMİTCAN ÇİNAR]
 * Ogrenci No: [250541009]
 * Tarih: [09/11/2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;
class sepethesap {
    final static double KDVOrani = (0.18);
    final static double SabitKargoUcreti = 29.99;
//METOTLARI TANIMLA
    // METOT 1: Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double toplamFiyatHesaplayıcı(double fiyat, int adet) {
        // fiyat Toplami = fiyat * adet
        return fiyat * adet;
    }
    // METOT 2: Sepetteki 3 urunun ara toplamini hesaplar
    public static double araToplam(double urun1, double urun2, double urun3) {
        // Ara Toplam = urun1 + urun2 + urun3
        return  urun1 + urun2 + urun3;
    }
    // METOT 3: Indirim tutarini hesaplar
    public static double indirimTutariHesaplayici(double aratoplam, double indirimYuzdesi) {
        // Indirim Tutari = aratoplam * (indirimYuzdesi / 100)
        return aratoplam * (indirimYuzdesi / 100);
    }

    // METOT 4: Indirimli fiyati hesaplar (aratoplam - indirimTutari)
    public static double indirimliFiyatHesaplayici(double aratoplam, double indirimTutari) {
        // Indirimli Toplam = araToplam - indirimTutari
        return aratoplam - indirimTutari;
    }
    // METOT 5: KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double kdvoraniHesaplayici(double indirimliTutar, double KDVOrani) {
        // KDV Tutari = indirimliTutar * KDVOrani
        return indirimliTutar * KDVOrani;
    }

    // METOT 6: Genel toplami hesaplar (indirimliTutar + kdv + kargo)
    public static double genelToplamHesaplayici(double indirimliTutar, double kdvoraniHesaplayici, double SabitKargoUcreti) {
        // Genel Toplam = indirimliTutar + kdvoraniHesaplayici + SabitKargoUcreti
        return  indirimliTutar + kdvoraniHesaplayici + SabitKargoUcreti;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 ürünün bilgilerini girin:");
        // URUN 1 Bilgileri
        System.out.println("\nURUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat1 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet1 = input.nextInt();

        // URUN 2 Bilgileri
        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat2 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet2 = input.nextInt();

        // URUN 3 Bilgileri
        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double fiyat3 = input.nextDouble();
        System.out.print("  Adet: ");
        int adet3 = input.nextInt();

        // Indirim Bilgisi
        System.out.println("\nIndirim Kuponu Yuzdesi (%): ");
        double indirimYuzdesi = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir

        // 1. Urunlerin satis toplamlarini hesapla

        // 2. Ara toplami hesapla

        // 3. Indirim tutarini hesapla


        // 4. Indirimli toplami hesapla


        // 5. KDV tutarini hesapla (Indirimli toplam uzerinden)


        // 6. Genel toplami hesapla

        // SONUCLARI YAZDIR


        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        double ilkUrunToplami = toplamFiyatHesaplayıcı(fiyat1, adet1);
        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", fiyat1, adet1, ilkUrunToplami);
        double ikinciUrunToplami = toplamFiyatHesaplayıcı(fiyat2, adet2);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", fiyat2, adet2, ikinciUrunToplami);
        double ucuncuUrunToplami = toplamFiyatHesaplayıcı(fiyat3, adet3);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", fiyat3, adet3, ucuncuUrunToplami);
        System.out.println("----------------------------------------");
        double aratoplam = araToplam(ilkUrunToplami,ikinciUrunToplami,ucuncuUrunToplami);
        System.out.printf("Ara Toplam                   : %.2f TL\n", aratoplam);
        double indirimTutari = indirimTutariHesaplayici(aratoplam ,indirimYuzdesi);
        System.out.printf("\nIndirim Tutari             : -%.2f TL\n", indirimYuzdesi, indirimTutari);
        double IndirimliToplam =indirimliFiyatHesaplayici(aratoplam,indirimTutari);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", IndirimliToplam);
        double kdvToplam = kdvoraniHesaplayici(indirimTutari,KDVOrani);
        System.out.printf("\nKDV Tutari                 : +%.2f TL\n", KDVOrani, kdvToplam);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", SabitKargoUcreti);
        System.out.println("----------------------------------------");
        double genelToplamHesaplayici = genelToplamHesaplayici(IndirimliToplam, kdvToplam, SabitKargoUcreti);
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", genelToplamHesaplayici );
        System.out.println("========================================");

    }


}
