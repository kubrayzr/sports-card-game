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

        for (int i = 0; i < 4; i++) {
            kartListesi[i] = futbolcular.get(i);
            kartListesi[i + 4] = basketbolcular.get(i);
        }
    }


    // Kartları yazdır
    public void kartlariYazdir() {
        for (Sporcu s : kartListesi) {
            // Futbolcu veya Basketbolcu olduğuna bakarak bilgileri yazdır
            if (s instanceof Futbolcu) {
                Futbolcu futbolcu = (Futbolcu) s;
                System.out.println("Futbolcu: " + futbolcu.getSporcuIsim() + " - Takım: " + futbolcu.getSporcuTakim() +
                        " - Penaltı: " + futbolcu.getPenalti() + " - Serbest Atış: " + futbolcu.getSerbestAtis() +
                        " - Kaleci Karşısı: " + futbolcu.getKaleciKarsiKarsiya());
            } else if (s instanceof Basketbolcu) {
                Basketbolcu basketbolcu = (Basketbolcu) s;
                System.out.println("Basketbolcu: " + basketbolcu.getSporcuIsim() + " - Takım: " + basketbolcu.getSporcuTakim() +
                        " - İkilik " + basketbolcu.getIkilik() + " Üçlük: " + basketbolcu.getUcluk() +
                        " Serbest Atış " + basketbolcu.getSerbestAtis());
            }
        }
    }

    public void kartSec()
    {

    }


}






