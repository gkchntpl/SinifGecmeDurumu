// veri çekileceği için yani öğrencilerden not girilmesi isteneceği için scanner sınıfı tanımlıyoruz.

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        // sonrasında değişkenleri ve bu değişkenleri kullanabilmek için nesneleri yazıyoruz.

        int Matematik, Fizik, Kimya, Turkce, Muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        Matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        Fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        Kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        Turkce = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        Muzik = input.nextInt();

        // şimdi not toplamlarını yapıyoruz. bu toplam için de bir değişken tanımlıyoruz.

        double Toplam;
        Toplam = Matematik + Fizik + Kimya + Turkce + Muzik;

        // şimdi de bir sonuç değişkeni tanımlamamız gerekiyor. double kullanılması makul. zira sonuç kusüratlı olabilir.

        double Sonuc;
        Sonuc = Toplam / 5;

        if (Matematik < 0 || Matematik > 100) {
            System.out.println(Toplam = Fizik + Kimya + Turkce + Muzik);
        } else if (Fizik < 0 || Fizik > 100) {
            System.out.println(Toplam = Matematik + Kimya + Turkce + Muzik);
        } else if (Kimya < 0 || Kimya > 100) {
            System.out.println(Toplam = Fizik + Matematik + Turkce + Muzik);
        } else if (Turkce < 0 || Turkce > 100) {
            System.out.println(Toplam = Fizik + Kimya + Matematik + Muzik);
        } else if (Muzik < 0 || Muzik > 100) {
            System.out.println(Toplam = Fizik + Kimya + Turkce + Matematik);
        }

        System.out.println(Sonuc = Toplam / 4);

        if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100)) {
            System.out.println(Toplam = Kimya + Turkce + Muzik);
        } else if ((Matematik < 0 || Matematik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Fizik + Turkce + Muzik);
        } else if ((Matematik < 0 || Matematik > 100) && (Turkce < 0 || Turkce > 100)) {
            System.out.println(Toplam = Fizik + Kimya + Muzik);
        } else if ((Matematik < 0 || Matematik > 100) && (Muzik < 0 || Muzik > 100)) {
            System.out.println(Toplam = Fizik + Kimya + Turkce);
        } else if ((Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Matematik + Turkce + Muzik);
        } else if ((Fizik < 0 || Fizik > 100) && (Turkce < 0 || Turkce > 100)) {
            System.out.println(Toplam = Matematik + Kimya + Muzik);
        } else if ((Fizik < 0 || Fizik > 100) && (Muzik < 0 || Muzik > 100)) {
            System.out.println(Toplam = Matematik + Kimya + Turkce);
        } else if ((Turkce < 0 || Turkce > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Matematik + Fizik + Muzik);
        } else if ((Muzik < 0 || Muzik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Matematik + Fizik + Turkce);
        } else if ((Turkce < 0 || Turkce > 100) && (Muzik < 0 || Muzik > 100)) {
            System.out.println(Toplam = Matematik + Fizik + Kimya);
        }

        System.out.println(Sonuc = Toplam / 3);

        if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Turkce + Muzik);
        } else if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Turkce < 0 || Turkce > 100)) {
            System.out.println(Toplam = Kimya + Muzik);
        } else if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Muzik < 0 || Muzik > 100)) {
            System.out.println(Toplam = Kimya + Turkce);
        } else if ((Turkce < 0 || Turkce > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Matematik + Muzik);
        } else if ((Muzik < 0 || Muzik > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Matematik + Turkce);
        } else if ((Turkce < 0 || Turkce > 100) && (Muzik < 0 || Muzik > 100) && (Kimya < 0 || Kimya > 100)) {
            System.out.println(Toplam = Matematik + Fizik);
        }

        System.out.println(Sonuc = Toplam / 2);

        if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100) && (Turkce<0 || Turkce>100)){
            System.out.println(Toplam=Muzik);
        }else if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100) && (Muzik<0 || Muzik>100)){
            System.out.println(Toplam=Turkce);
        }else if ((Muzik < 0 || Muzik > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100) && (Turkce<0 || Turkce>100)){
            System.out.println(Toplam=Matematik);
        }else if ((Matematik < 0 || Matematik > 100) && (Muzik < 0 || Muzik > 100) && (Kimya < 0 || Kimya > 100) && (Turkce<0 || Turkce>100)){
            System.out.println(Toplam=Fizik);
        }else if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Muzik < 0 || Muzik > 100) && (Turkce<0 || Turkce>100)){
            System.out.println(Toplam=Kimya);
        }

        System.out.println(Sonuc=Toplam);

        if ((Matematik < 0 || Matematik > 100) && (Fizik < 0 || Fizik > 100) && (Kimya < 0 || Kimya > 100) && (Turkce<0 || Turkce>100) && (Muzik <0 || Muzik>100)){
            System.out.println(Toplam=0);
        }
        System.out.println(Sonuc=0);

        System.out.println("Ortalamanız : " + Sonuc);

        // son olarak ortalama 55'in altında ise kaldı, 55 ve üzerinde ise geçti ibaresini yazdırmamız lazım.

        // ilk olarak koşul değişkenlerini oluşturuyoruz.

        boolean Kosul;
        Kosul = (Sonuc < 55);


        // son olarak bu koşul operatörlerine göre son durumu geçti kaldı şeklinde hazırlamamız lazım.

        String Durumunuz;
        Durumunuz = Kosul ? "Sınıfta kaldınız. Seneye tekrar görüşmek üzere" : "Tebrikler! Sınıfı geçtiniz.";

        System.out.println("Sınıf Durumu : " + Durumunuz);


    }
}
