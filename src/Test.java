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

    Basketbolcu LebronJames = new Basketbolcu(85, 90, 95, false, "Lebron James", "Los Angeles Lakers", 9);
    Basketbolcu StephenCurry = new Basketbolcu(90, 95, 100, false, "Stephen Curry", "Golden State Warriors", 10);
    Basketbolcu KlayThompson = new Basketbolcu(86, 93, 92, false, "Klay Thompson", "Golden State Warriors", 11);
    Basketbolcu JamesHarden = new Basketbolcu(88, 91, 91, false, "James Harden", "Houston Rockets", 12);
    Basketbolcu RusselWestbrook = new Basketbolcu(82, 83, 83, false, "Russel Westbrook", "Houston Rockets", 13);
    Basketbolcu BrandonIngram = new Basketbolcu(74, 77, 75, false, "Brandon Ingram", "New Orleans Pelicans", 14);
    Basketbolcu AnthonyDavis = new Basketbolcu(72, 79, 76, false, "Anthony Davis", "Los Angeles Lakers", 15);
    Basketbolcu KevinDurant = new Basketbolcu(92, 92, 90, false, "Kevin Durant", "Brooklyn Nets", 16);

    /*Futbolcu seçimi yapılacağı zaman penaltı, serbest vuruş ve kaleciyle karşı karşıya pozisyonlarından;
basketbolcu seçimi yapılacağı zaman üçlük, ikilik ve serbest atış pozisyonlarından rastgele birinin
seçimi oyuncuların kart seçimi yapıldıktan sonra burada yapılmalıdır.
Futbolcu ve basketbolcuların özelliklerin ataması için getter ve setter metotları da, Constructor’da
kullanılabilmelidir. Oyunun ilerleyişi buradan takip edilmelidir.*/

    public static void main(String[] args) {

        Test test1 = new Test();  // Test sınıfı burada zaten sporcuları tanımlıyor



        Bilgisayar bilgisayar = new Bilgisayar(2, "Yapay Zeka", 0);
        bilgisayar.kartlariAta(test1); // oyuncu sınıfının fnksiyonu
        bilgisayar.kartlariYazdir();
        System.out.println("/////////////////////////////////////////////////////////");
        System.out.println("Kullanıcının Kartları");
        Kullanici kullanici = new Kullanici(1,"Kubra",0);
        kullanici.kartlariAta(test1); // oyuncu sınıfının fnksiyonu
        kullanici.kartlariYazdir();
      //  bilgisayar.kartSec(); // bilgisayar sınıfının fonksiyonu
        Sporcu bilgisayarKarti = bilgisayar.kartSec();
        Sporcu kullaniciKarti = kullanici.kartSec();




    }







}
