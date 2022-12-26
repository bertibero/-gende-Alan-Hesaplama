import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Değişkenler Tanımla
        double a,b,c,u,alan;

        // Kullanıcı Verileri
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = girdi.nextDouble();

        System.out.print("2.Kenarı Giriniz : ");
        b = girdi.nextDouble();

        System.out.print("3.Kenarı Giriniz : ");
        c = girdi.nextDouble();

        u = (a+b+c) / 2 ;
        System.out.println("Üçgenin Çevresi : " + 2*u);

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)) ;
        System.out.println("Üçgenin Alanı : " + alan);

    }
}