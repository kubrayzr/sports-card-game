import java.util.Random;

public class Test {
//Benzema ,Hernandez, Ronaldinho , Zidane , Modric , Maradona , Maldini,Zlatan

    Futbolcu LionelMessi = new Futbolcu(97, 89, 90, false, "Lionel Messi", "Barcelona", 1);
    Futbolcu CristianoRonaldo = new Futbolcu(95, 80, 90, false, "Cristiano Ronaldo", "Juventus", 2);
    Futbolcu EdenHazard = new Futbolcu(90, 90, 95, false, "Eden Hazard", "Real Madrid", 3);
    Futbolcu SergioRamos = new Futbolcu(70, 50, 60, false, "Sergio Ramos", "Real Madrid", 4);
    Futbolcu SergioBusquets = new Futbolcu(73, 60, 65, false, "Sergio Busquets", "Barcelona", 5);
    Futbolcu LeroySane = new Futbolcu(84, 82, 81, false, "Leroy Sane", "Bayern Münih", 6);
    Futbolcu JulianBrandt = new Futbolcu(77, 86, 88, false, "Julian Brandt", "Borussia Dortmund", 7);
    Futbolcu BreelEmbolo = new Futbolcu(78, 70, 92, false, "Breel Embolo", "Borussia Mönchengladbach", 8);

    Basketbolcu LebronJames = new Basketbolcu(90, 90, 95, false, "Lebron James", "Los Angeles Lakers", 9);
    Basketbolcu StephenCurry = new Basketbolcu(90, 95, 100, false, "Stephen Curry", "Golden State Warriors", 10);
    Basketbolcu KlayThompson = new Basketbolcu(90, 93, 92, false, "Klay Thompson", "Golden State Warriors", 11);
    Basketbolcu JamesHarden = new Basketbolcu(90, 91, 91, false, "James Harden", "Houston Rockets", 12);
    Basketbolcu RusselWestbrook = new Basketbolcu(90, 83, 83, false, "Russel Westbrook", "Houston Rockets", 13);
    Basketbolcu BrandonIngram = new Basketbolcu(90, 77, 75, false, "Brandon Ingram", "New Orleans Pelicans", 14);
    Basketbolcu AnthonyDavis = new Basketbolcu(90, 79, 76, false, "Anthony Davis", "Los Angeles Lakers", 15);
    Basketbolcu KevinDurant = new Basketbolcu(92, 92, 90, false, "Kevin Durant", "Brooklyn Nets", 16);

    /*Futbolcu seçimi yapılacağı zaman penaltı, serbest vuruş ve kaleciyle karşı karşıya pozisyonlarından;
basketbolcu seçimi yapılacağı zaman üçlük, ikilik ve serbest atış pozisyonlarından rastgele birinin
seçimi oyuncuların kart seçimi yapıldıktan sonra burada yapılmalıdır.
Futbolcu ve basketbolcuların özelliklerin ataması için getter ve setter metotları da, Constructor’da
kullanılabilmelidir. Oyunun ilerleyişi buradan takip edilmelidir.*/

    public static void main(String[] args) {
        Test test1 = new Test();  // Yeni test nesnesi yarattım ve  burada zaten sporcuları tanımlıyor
        Bilgisayar bilgisayar = new Bilgisayar(2, "Kübra PC", 0);
        Kullanici kullanici = new Kullanici(1, "Kubra", 0);

//        bilgisayar.kartlariYazdir(); her seferinde bilgisayarın kartları yazılmak zorunda değil.
        for (int i = 0; i <= 7; i++) {

            bilgisayar.kartlariAta(test1); // oyuncu sınıfının fonku kartları bilgisayar nesnesinde tuttum.

            System.out.println("\n >>>>>>>>>>>>>>>>>>>>YENİ OYUN<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("\n Kullanıcının Kartları");

            kullanici.kartlariAta(test1); // oyuncu sınıfının fonksiyonu kullanıcı nesnesinde bu fonku uyguladım
            kullanici.kartlariYazdir();
            //  bilgisayar.kartSec(); // bilgisayar sınıfının fonksiyonu


            Sporcu bilgisayarKarti = bilgisayar.kartSec();
            Sporcu kullaniciKarti = kullanici.kartSec();

            System.out.println("Kartlar açılıyor...");
            Test.karsilastirSporcuPozisyon(bilgisayarKarti, kullaniciKarti, bilgisayar, kullanici);
            if (i == 7) {
                if (bilgisayar.getSkor() > kullanici.getSkor()) {
                    System.out.println("Kazanan: Bilgisayar (" + bilgisayar.getSkor() + " puan)");
                } else if (kullanici.getSkor() > bilgisayar.getSkor()) {
                    System.out.println("Kazanan: Kullanıcı (" + kullanici.getSkor() + " puan)");
                } else {
                    System.out.println("Berabere!");
                }
            }

        }


    }

    public static void karsilastirSporcuPozisyon(Sporcu kart1, Sporcu kart2, Oyuncu bilgisayar, Oyuncu kullanici) {
        Random rand = new Random();


        if (kart1 instanceof Futbolcu && kart2 instanceof Futbolcu) {
            // Futbol pozisyonları
            String[] pozisyonlar = {"penalti", "serbestAtis", "kaleciKarsiKarsiya"};
            int secilenIndex = rand.nextInt(pozisyonlar.length);
            String secilenPozisyon = pozisyonlar[secilenIndex];

            Futbolcu f1 = (Futbolcu) kart1;
            Futbolcu f2 = (Futbolcu) kart2;

            int puan1 = 0;
            int puan2 = 0;

            switch (secilenPozisyon) {
                case "penalti":
                    puan1 = f1.getPenalti();
                    puan2 = f2.getPenalti();
                    break;
                case "serbestAtis":
                    puan1 = f1.getSerbestAtis();
                    puan2 = f2.getSerbestAtis();
                    break;
                case "kaleciKarsiKarsiya":
                    puan1 = f1.getKaleciKarsiKarsiya();
                    puan2 = f2.getKaleciKarsiKarsiya();
                    break;
            }

            System.out.println("Seçilen pozisyon: " + secilenPozisyon);
            System.out.println(f1.getSporcuIsim() + ": " + puan1 + " vs " + f2.getSporcuIsim() + ": " + puan2);

            if (puan1 > puan2) {
                System.out.println("SONUÇ: " + f1.getSporcuIsim() + " kazandı!");
                bilgisayar.addSkor(10);
                System.out.println("Bilgisayar kazandı! Skor: " + bilgisayar.getSkor());
            } else if (puan2 > puan1) {
                System.out.println("SONUÇ: " + f2.getSporcuIsim() + " kazandı!");
                kullanici.addSkor(10);
                System.out.println("Kullanıcı kazandı! Skor: " + kullanici.getSkor());
            } else {
                System.out.println("SONUÇ: Berabere. Kartlar geri alınır.");
            }
        } else if (kart1 instanceof Basketbolcu && kart2 instanceof Basketbolcu) {
            // Basketbol pozisyonları
            String[] pozisyonlar = {"ikilik", "ucluk", "serbestAtis"};
            int secilenIndex = rand.nextInt(pozisyonlar.length);
            String secilenPozisyon = pozisyonlar[secilenIndex];

            Basketbolcu b1 = (Basketbolcu) kart1;
            Basketbolcu b2 = (Basketbolcu) kart2;

            int puan1 = 0;
            int puan2 = 0;

            switch (secilenPozisyon) {
                case "ikilik":
                    puan1 = b1.getIkilik();
                    puan2 = b2.getIkilik();
                    break;
                case "ucluk":
                    puan1 = b1.getUcluk();
                    puan2 = b2.getUcluk();
                    break;
                case "serbestAtis":
                    puan1 = b1.getSerbestAtis();
                    puan2 = b2.getSerbestAtis();
                    break;
            }

            System.out.println("Seçilen pozisyon: " + secilenPozisyon);
            System.out.println(b1.getSporcuIsim() + ": " + puan1 + " vs " + b2.getSporcuIsim() + ": " + puan2);

            if (puan1 > puan2) {
                System.out.println("SONUÇ: " + b1.getSporcuIsim() + " kazandı!");
                bilgisayar.addSkor(10);
                System.out.println("Bilgisayar kazandı! Skor: " + bilgisayar.getSkor());
            } else if (puan2 > puan1) {
                System.out.println("SONUÇ: " + b2.getSporcuIsim() + " kazandı!");
                kullanici.addSkor(10);
                System.out.println("Kullanıcı kazandı! Skor: " + kullanici.getSkor());

            } else {
                System.out.println("SONUÇ: Berabere. Kartlar geri alınır.");

            }
        } else {
            System.out.println("HATA: İki kart farklı türde. Aynı tür kartlarla karşılaştırma yapılmalı.");
        }
    }


}
