package cv_odev;

public class Deneyim {
    private String meslek;
    private String sirket_ismi;
    private String calisma_sehri;
    private String yillar;
    private String is_aciklamasi;

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }
    
    public String getSirketIsmi() {
        return sirket_ismi;
    }
    
    public void setSirketIsmi(String sirket_ismi) {
        this.sirket_ismi = sirket_ismi;
    }
    
    public String getCalismaSehri() {
        return calisma_sehri;
    }
    
    public void setCalismaSehri(String calisma_sehri) {
        this.calisma_sehri = calisma_sehri;
    }
    
    public String getYillar() {
        return yillar;
    }
    
    public void setYillar(String yillar) {
        this.yillar = yillar;
    }
    
    public String getIsAciklamasi() {
        return is_aciklamasi;
    }
    
    public void setIsAciklamasi(String is_aciklamasi) {
        this.is_aciklamasi = is_aciklamasi;
    }

    public Deneyim(String meslek, String sirket_ismi, String calisma_sehri, String yillar, String is_aciklamasi) {
        this.meslek = meslek;
        this.sirket_ismi = sirket_ismi;
        this.calisma_sehri = calisma_sehri;
        this.yillar = yillar;
        this.is_aciklamasi = is_aciklamasi;
    }
}
