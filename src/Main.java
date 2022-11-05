import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);


        // 1=toplama 2=çıkarma 3=çarpma 4=bölme 5=üs alma
        int sayi1;
        int sayi2;
        System.out.println("yapmak istediğiniz işlemi seçiniz: ");
        int islem = klavye.nextInt();

        switch (islem) {
            case 1 :
                System.out.println("1.sayi: ");
                sayi1 = klavye.nextInt();
                System.out.println("2.sayi: ");
                sayi2 = klavye.nextInt();
                System.out.println("Toplam: "+(sayi1+sayi2));
                break;

            case 2 :
                System.out.println("1.sayi: ");
                sayi1 = klavye.nextInt();
                System.out.println("2.sayi: ");
                sayi2 = klavye.nextInt();
                System.out.println("Fark: "+(sayi1-sayi2));
                break;

            case 3 :
                System.out.println("1.sayi: ");
                sayi1 = klavye.nextInt();
                System.out.println("2.sayi: ");
                sayi2 = klavye.nextInt();
                System.out.println("Çarpım: "+(sayi1*sayi2));
                break;

            case 4 :
                System.out.println("1.sayi: ");
                sayi1 = klavye.nextInt();
                System.out.println("2.sayi: ");
                sayi2 = klavye.nextInt();
                System.out.println("Bölüm: "+(sayi1/sayi2));
                break;

            default:
                System.out.println("geçersiz işlem");
        }
    }
}