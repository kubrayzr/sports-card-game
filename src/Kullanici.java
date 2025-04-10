import java.util.Scanner;

public class Kullanici extends Oyuncu{

    public Kullanici() {
    }

    public Kullanici(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }

    @Override
    public void kartSec() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nElinizdeki kartlar:");
        for (int i = 0; i < kartListesi.length; i++) {
            System.out.println((i + 1) + ". " + kartListesi[i].getSporcuIsim() + " (" + kartListesi[i].getSporcuTakim() + ")");
        }

        System.out.print("Ortaya koymak istediğiniz kartın numarasını girin (1-8): ");
        int secim = scanner.nextInt();

        // Giriş kontrolü
        while (secim < 1 || secim > 8 || kartListesi[secim - 1] == null) {
            System.out.print("Geçersiz seçim. Lütfen 1 ile 8 arasında geçerli bir numara girin: ");
            secim = scanner.nextInt();
        }

        Sporcu secilenKart = kartListesi[secim - 1];

        // Seçilen kartı göster ve diziden sil (null yaparak)
        System.out.println("Seçilen kart: " + secilenKart.getSporcuIsim() + " - " + secilenKart.getSporcuTakim());
        kartListesi[secim - 1] = null;  // Kart artık elde değil
    }



}
