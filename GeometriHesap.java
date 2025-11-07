/*
 * Ad Soyad: [ÜMİTCAN ÇİNAR]
 * Ogrenci No: [250541009]
 * Tarih: [7/11/2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */
import java.util.Scanner;

public class GeometrikSekilhesaplayici {
//FORMÜLLERİN METOTLARI

    //KARE
    static final double PI = 3.14159;
    public static double calculateSquareArea(double side ) {
        return side * side;
    }
    public static double calculateSquarePerimeter(double side) {
        return 4*side;
    }
    //DİKTÖRTGEN
    public static double calculateRectangleArea(double wight, double height) {
        return wight * height;
    }
    public static double calculateRectanglePerimeter(double wight, double height) {
        return 2*(wight+height);
    }
    //ÜÇGEN
    public static double calculateTriangleArea(double b, double height) {
        return (b * height)/2;
    }
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return (a+b+c);
    }
    //ÇEMBER
    public static double calculateCircleArea(double radius) {
        return PI*radius*radius;
    }
    public static double calculateCirclePerimeter(double radius) {
        return 2 * PI * radius;
    }

    //USER'DAN VERİLERİ AL
    public static void main(String [] args) {
        System.out.println("===ÜMİTCNR İYİ DERSLER DİLER===");
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kare için kenar değeri giriniz");
        double kenar = input.nextDouble();
        System.out.println("lütfen dikdörtgen için yükseklik değeri giriniz");
        double yukseklik = input.nextDouble();
        System.out.println("lütfen dikdörtgen için genislik değeri giriniz");
        double genislik = input.nextDouble();
        System.out.println("lütfen üçgen için altTaban değeri giriniz");
        double altTaban = input.nextDouble();
        System.out.println("lütfen üçgen için yükseklik değeri giriniz");
        double h = input.nextDouble();
        System.out.println("lütfen üçgen için 1.kenar değerini giriniz");
        double a = input.nextDouble();
        System.out.println("lütfen üçgen için 2.kenar değerini giriniz");
        double b = input.nextDouble();
        System.out.println("lütfen üçgen için 3.kenar değerini giriniz");
        double c = input.nextDouble();
        System.out.println("lütfen çember için yarıçap değeri giriniz");
        double r = input.nextDouble();

       //YAZDIRMA AŞAMASI
        System.out.println("============================");
        System.out.println("    "+"HESAPLAMA SONUÇLARI");
        System.out.println("============================");


        double kareAlani= calculateSquareArea(kenar);
        System.out.printf("Karenin Alanı = %.2f \n", kareAlani);
        double kareCevresi= calculateSquarePerimeter(kenar);
        System.out.printf("Karenin Çevresi = %.2f \n", kareCevresi);
        double diktortgenAlani= calculateTriangleArea(yukseklik,genislik);
        System.out.printf("Diktörtgenin Alanı = %.2f \n", diktortgenAlani);
        double diktortgenCevresi = calculateRectanglePerimeter(yukseklik,genislik);
        System.out.printf("Diktörtgenin Çevresi =  %.2f \n", diktortgenCevresi);
        double cemberAlani= calculateTriangleArea(yukseklik,altTaban);
        System.out.printf("Çemberin Alanı = %.2f \n", cemberAlani);
        double cemberCevresi= calculateCirclePerimeter(r);
        System.out.printf("Çemberin Çveresi = %.2f \n", cemberCevresi);
        double ucgenAlani= calculateTriangleArea(h,a);
        System.out.printf("Üçgenin Alani = %.2f \n", ucgenAlani);
        double ucgenCevresi= calculateTrianglePerimeter(a,b,c);
        System.out.printf("Üçgenin Çveresi =  %.2f \n", ucgenCevresi);
        System.out.println("===ÜMİTCNR İYİ DERSLER DİLER===");
    }
}


