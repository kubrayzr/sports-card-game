import java.util.Scanner;

public class Kullanici extends Oyuncu{

    public Kullanici() {
    }

    public Kullanici(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }

    @Override
    public Sporcu kartSec() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Seçtiğiniz  kartın numarasını girin (1-8): ");
        int secim = scanner.nextInt();

        // Giriş kontrolü
        while (secim < 1 || secim > 8 || kartListesi[secim - 1] == null) {
            System.out.print("Geçersiz seçim. Lütfen 1 ile 8 arasında geçerli bir numara girin: ");
            secim = scanner.nextInt();
        }
        Sporcu secilenKart = kartListesi[secim - 1];
        // Seçilen kartı türüne göre detaylı yazdır
        System.out.println("\nSeçilen kart bilgileri:");
        if (secilenKart instanceof Futbolcu) {
            Futbolcu f = (Futbolcu) secilenKart;
            System.out.println("Futbolcu: " + f.getSporcuIsim()+ " Takım: " + f.getSporcuTakim() + " Penaltı: " + f.getPenalti()+ " Serbest Atış: " + f.getSerbestAtis() + " Kaleciyle Karşı Karşıya: " + f.getKaleciKarsiKarsiya());
           ;
        } else if (secilenKart instanceof Basketbolcu) {
            Basketbolcu b = (Basketbolcu) secilenKart;
            System.out.println("Basketbolcu: " + b.getSporcuIsim() +" Takım: " + b.getSporcuTakim()+ " İkilik: " + b.getIkilik() + " Üçlük: " + b.getUcluk()+" Serbest Atış: " + b.getSerbestAtis());
        }
        // Seçilen kartı elden çıkar (kullanıldı işareti için null yap)
        kartListesi[secim - 1] = null;
        return secilenKart;//"Ben bu kartı seçtim, bu kartı dışarıya (çağıran metoda) gönderiyorum."
    }// kartsec fonksiyonunun bitişi




}
