import java.util.ArrayList;
import java.util.Collections;

public abstract class Oyuncu {

    private int oyuncuId;
    private String oyuncuAdi;
    private int skor;

    public Oyuncu() {
    }

    public Oyuncu(int oyuncuId, String oyuncuAdi, int skor) {
        this.oyuncuId = oyuncuId;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;

    }

    public Sporcu kartListesi[]=new Sporcu[8];

    //skorgoster nasıl kullanılır burda????
    //kartSec() fonksiyonu yazılmalı fakat bu sınıf bilgisayar ve kullanıcı için farklı durumlarda
    //çalışacağı unutulmamalıdır.
    public static ArrayList<Sporcu> kullanilanKartlar = new ArrayList<>();
    public void kartlariAta(Test test) {
        ArrayList<Sporcu> futbolcular = new ArrayList<>();
        futbolcular.add(test.LionelMessi);
        futbolcular.add(test.CristianoRonaldo);
        futbolcular.add(test.EdenHazard);
        futbolcular.add(test.SergioRamos);
        futbolcular.add(test.SergioBusquets);
        futbolcular.add(test.LeroySane);
        futbolcular.add(test.JulianBrandt);
        futbolcular.add(test.BreelEmbolo);

        ArrayList<Sporcu> basketbolcular = new ArrayList<>();
        basketbolcular.add(test.LebronJames);
        basketbolcular.add(test.StephenCurry);
        basketbolcular.add(test.KlayThompson);
        basketbolcular.add(test.JamesHarden);
        basketbolcular.add(test.RusselWestbrook);
        basketbolcular.add(test.BrandonIngram);
        basketbolcular.add(test.AnthonyDavis);
        basketbolcular.add(test.KevinDurant);

        Collections.shuffle(futbolcular);
        Collections.shuffle(basketbolcular);


// bu iki for iki oyuncuya aynı kartları vermememizi sağlıyor.
        int index = 0;
        for (Sporcu kart : futbolcular) {
            if (!kullanilanKartlar.contains(kart)) {
                kartListesi[index++] = kart;
                kullanilanKartlar.add(kart);
            }
            if (index == 4) break;
        }
        for (Sporcu kart : basketbolcular) {
            if (!kullanilanKartlar.contains(kart)) {
                kartListesi[index++] = kart;
                kullanilanKartlar.add(kart);
            }
            if (index == 8) break;
        }
// bu iki for iki oyuncuya aynı kartları vermememizi sağlıyor.
    }


    // Kartları yazdır
    public void kartlariYazdir() {
        for (int i = 0; i < kartListesi.length; i++) {
            Sporcu s = kartListesi[i];
            if (s == null) {
                System.out.println((i + 1) + ". --- (Kullanıldı)");
                continue;
            }

            if (s instanceof Futbolcu) {
                Futbolcu f = (Futbolcu) s;
                System.out.println((i + 1) + ". Futbolcu: " + f.getSporcuIsim() + " - Takım: " + f.getSporcuTakim() +
                        " - Penaltı: " + f.getPenalti() + " - Serbest Atış: " + f.getSerbestAtis() +
                        " - Kaleci Karşısı: " + f.getKaleciKarsiKarsiya());
            } else if (s instanceof Basketbolcu) {
                Basketbolcu b = (Basketbolcu) s;
                System.out.println((i + 1) + ". Basketbolcu: " + b.getSporcuIsim() + " - Takım: " + b.getSporcuTakim() +
                        " - İkilik: " + b.getIkilik() + " - Üçlük: " + b.getUcluk() +
                        " - Serbest Atış: " + b.getSerbestAtis());

            }
        }
    }

    public abstract Sporcu kartSec();


}






