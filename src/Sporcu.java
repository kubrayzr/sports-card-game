public class Sporcu {


    private String sporcuIsim;
    private String sporcuTakim;
    private int sporcuId;

    public Sporcu()
    {}

    public Sporcu(String sporcuIsim, String sporcuTakim, int sporcuId) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.sporcuId = sporcuId;
    }

    public void sporcuPuaniGoster() {
        System.out.println(" isimli sporcunun puanı: " );
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public int getSporcuId() {
        return sporcuId;
    }

    public void setSporcuId(int sporcuId) {
        this.sporcuId = sporcuId;
    }
}
