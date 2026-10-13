package cv_odev;

public class Sertifika {
    private String yillar;
    private String alinan_yer;
    private String sertifika_ismi;

    public String getYillar() {
        return yillar;
    }
    
    public void setYillar(String yillar) {
        this.yillar = yillar;
    }
    
    public String getAlinanYer() {
        return alinan_yer;
    }

    public void setAlinanYer(String alinan_yer) {
        this.alinan_yer = alinan_yer;
    }

    public String getSertifikaIsmi() {
        return sertifika_ismi;
    }

    public void setSertifikaIsmi(String sertifika_ismi) {
        this.sertifika_ismi = sertifika_ismi;
    }

    public Sertifika(String yillar, String alinan_yer, String sertifika_ismi) {
        this.yillar = yillar;
        this.alinan_yer = alinan_yer;
        this.sertifika_ismi = sertifika_ismi;
    }
}
