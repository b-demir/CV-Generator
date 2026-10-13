package cv_odev;

import java.util.List;
import java.util.ArrayList;

public class CV {
    private String ad;
    private String soyad;
    private String telefon;
    private String mail;
    private String hakkimda;
    private String meslek;
    private List<String> beceriler = new ArrayList<>();
    private List<String> diller = new ArrayList<>();
    private List<Deneyim> deneyimler = new ArrayList<>();
    private List<Egitim> egitimler = new ArrayList<>();
    private List<Sertifika> sertifikalar = new ArrayList<>();
    
    public String getAd() {
        return ad;
    }
    
    public void setAd(String ad) {
        this.ad = ad;
    }
    
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    
    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getHakkimda() {
        return hakkimda;
    }
    
    public void setHakkimda(String hakkimda) {
        this.hakkimda = hakkimda;
    }
    
    public String getMeslek() {
        return meslek;
    }
    
    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }
    
    public List<String> getBeceriler() {
        return beceriler;
    }
    
    public void addBeceri(String beceri) {
        this.beceriler.add(beceri);
    }

    public List<String> getDiller() {
        return diller;
    }
    
    public void addDiller(String dil) {
        this.diller.add(dil);
    }

    public List<Deneyim> getDeneyimler() {
        return deneyimler;
    }
    
    public void addDeneyimler(Deneyim deneyim) {
        this.deneyimler.add(deneyim);
    }

    public List<Egitim> getEgitimler() {
        return egitimler;
    }
    
    public void addEgitimler(Egitim egitim) {
        this.egitimler.add(egitim);
    }

    public List<Sertifika> getSertifikalar() {
        return sertifikalar;
    }
    
    public void addSertifika(Sertifika sertifika) {
        this.sertifikalar.add(sertifika);
    }

    public CV(String ad, String soyad, String telefon, String mail, String hakkimda, String meslek) {
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.mail = mail;
        this.hakkimda = hakkimda;
        this.meslek = meslek;
    }
}
