package cv_odev;

public class Main {
    public static void main(String[] args) {
        CV yeni_cv = new CV("Buğra Demir", "Cihangir", "000000000", "00000000", "fsjrıpeokğakojnurışejoasnfoırsjoşıbvfpsıpbf", "Yazılım Mühendisliği");
        String beceri1 = "Zaman Yönetimi";
        String beceri2 = "Analitik Düşünme";
        String dil1 = "İngilizce B1";
        Deneyim deneyim1 = new Deneyim("Yazılım Mühendisliği", "Şirket1", "İstanbul", "2010-2013", "Harika yazılımlar yapmaktan sorumluydum");
        Deneyim deneyim2 = new Deneyim("Yazılım Mühendisliği", "Şirket2", "İstanbul", "2013-2016", "Harika yazılımlar yapmaktan sorumluydum");
        Deneyim deneyim3 = new Deneyim("Yazılım Mühendisliği", "Şirket3", "İstanbul", "2016-2019", "Harika yazılımlar yapmaktan sorumluydum");
        Egitim egitim1 = new Egitim("Üniversite", "Kırklareli Üniversitesi", "2025-2029");
        Sertifika sertifika1 = new Sertifika("2025-2026", "vnsjcdnjl", "fvdlsjfnjnl");

        yeni_cv.addBeceri(beceri1);
        yeni_cv.addBeceri(beceri2);
        yeni_cv.addDiller(dil1);
        yeni_cv.addDeneyimler(deneyim1);
        yeni_cv.addDeneyimler(deneyim2);
        yeni_cv.addDeneyimler(deneyim3);
        yeni_cv.addEgitimler(egitim1);
        yeni_cv.addSertifika(sertifika1);


        PDFYazdir pdf_yaz = new PDFYazdir();
        pdf_yaz.cvOlustur(yeni_cv, "CV.pdf", "resim.png");
    }
}