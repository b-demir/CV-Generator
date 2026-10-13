package cv_odev;

public class Egitim {
    private String egitim_turu;
    private String okul_adi;
    private String yillar;

    public String getEgitimTuru() {
        return egitim_turu;
    }
    
    public void setEgitimTuru(String egitim_turu) {
        this.egitim_turu = egitim_turu;
    }

    public String getOkulAdi() {
        return okul_adi;
    }
    
    public void setOkulAdi(String okul_adi) {
        this.okul_adi = okul_adi;
    }
    
    public String getYillar() {
        return yillar;
    }

    public void setYillar(String yillar) {
        this.yillar = yillar;
    }

    public Egitim(String egitim_turu, String okul_adi, String yillar) {
        this.egitim_turu = egitim_turu;
        this.okul_adi = okul_adi;
        this.yillar = yillar;
    }
}
