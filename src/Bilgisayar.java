import java.util.Random;


public class Bilgisayar extends Oyuncu {




    public Bilgisayar() {
    }

    public Bilgisayar(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }

    @Override
    public void kartSec() {
        Random rand = new Random();

        // Geçerli (null olmayan) kartları arar
        int secilenIndex;
        do {
            secilenIndex = rand.nextInt(kartListesi.length); // 0-7 arası rastgele sayı
        } while (kartListesi[secilenIndex] == null); // Boş olanı seçmesin

        Sporcu secilenKart = kartListesi[secilenIndex];
        System.out.println("Bilgisayar kart seçti: " + secilenKart.getSporcuIsim() + " - " + secilenKart.getSporcuTakim());

        kartListesi[secilenIndex] = null; // Kartı elden çıkart
    }
}
