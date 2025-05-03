import java.util.Random;


public class Bilgisayar extends Oyuncu {

    public Bilgisayar() {
    }

    public Bilgisayar(int oyuncuId, String oyuncuAdi, int skor) {
        super(oyuncuId, oyuncuAdi, skor);
    }


/*    @Override
    public Sporcu kartSec() {
        Random rand = new Random();

        // Geçerli (null olmayan) kartları arar
        int secilenIndex;
        do {
            secilenIndex = rand.nextInt(kartListesi.length); // 0-7 arası rastgele sayı
        } while (kartListesi[secilenIndex] == null); // Boş olanı seçmesin



        Sporcu secilenKart = kartListesi[secilenIndex];
        System.out.println("Bilgisayar kart seçti: " + secilenKart.getSporcuIsim() + " - " + secilenKart.getSporcuTakim()  );
        kartListesi[secilenIndex] = null; // Kartı elden çıkart
        return secilenKart; //"Ben bu kartı seçtim, bu kartı dışarıya (çağıran metoda) gönderiyorum."

    }*/

    @Override
    public Sporcu kartSec() {
        Random rand = new Random();

        // Geçerli (null olmayan) kartları arar
        int secilenIndex;
        do {
            secilenIndex = rand.nextInt(kartListesi.length); // 0-7 arası rastgele sayı
        } while (kartListesi[secilenIndex] == null); // Boş olanı seçmesin

        Sporcu secilenKart = kartListesi[secilenIndex];

        // Kart detaylarını yazdır
        System.out.println(" \n ----- Bilgisayar Kart Seçti -----");
        if (secilenKart instanceof Futbolcu) {
            Futbolcu f = (Futbolcu) secilenKart;
            System.out.println("Futbolcu: " + f.getSporcuIsim() +
                    " | Takım: " + f.getSporcuTakim() +
                    " | Penaltı: " + f.getPenalti() +
                    " | Serbest Atış: " + f.getSerbestAtis() +
                    " | Kaleci Karşısı: " + f.getKaleciKarsiKarsiya());
        } else if (secilenKart instanceof Basketbolcu) {
            Basketbolcu b = (Basketbolcu) secilenKart;
            System.out.println("Basketbolcu: " + b.getSporcuIsim() +
                    " | Takım: " + b.getSporcuTakim() +
                    " | İkilik: " + b.getIkilik() +
                    " | Üçlük: " + b.getUcluk() +
                    " | Serbest Atış: " + b.getSerbestAtis());
        } else {
            System.out.println("Bilinmeyen sporcu türü: " + secilenKart.getSporcuIsim());
        }

        // Kartı elden çıkar
        kartListesi[secilenIndex] = null;
        return secilenKart;
    }

}