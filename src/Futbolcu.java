public class Futbolcu extends Sporcu{
    private int penalti;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    private boolean kartKullanildiMi;


    public Futbolcu()
    {}


    public Futbolcu(  int penalti, int serbestAtis, int kaleciKarsiKarsiya , boolean kartKullanildiMi, String sporcuIsim, String sporcuTakim ,int sporcuId)
    {
    super(sporcuIsim,sporcuTakim,sporcuId);

    this.penalti=penalti;
    this.serbestAtis=serbestAtis;
    this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
    this.kartKullanildiMi=false;
    }

    @Override
    public void sporcuPuaniGoster() {
        super.sporcuPuaniGoster();
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }


}
