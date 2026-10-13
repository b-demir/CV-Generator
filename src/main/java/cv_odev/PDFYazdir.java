package cv_odev;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Text; // YENİ EKLENEN İÇE AKTARMA
import com.itextpdf.layout.properties.TextAlignment;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;

import java.io.IOException;

public class PDFYazdir {

    public void cvOlustur(CV cv, String pdfDosyaAdi, String resimYolu) {
        try {
            PdfWriter writer = new PdfWriter(pdfDosyaAdi);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // Türkçe karakter desteği sağlayan font ayarı
            PdfFont turkishFont = PdfFontFactory.createFont(StandardFonts.HELVETICA, "CP1254");
            document.setFont(turkishFont);

            // 1. İsim Soyisim (Başlık) - Text nesnesi ile kalın yapıldı
            Text isimText = new Text(cv.getAd() + " " + cv.getSoyad());
            Paragraph baslik = new Paragraph(isimText)
                    .setFontSize(22)
                    .setTextAlignment(TextAlignment.CENTER);
            document.add(baslik);

            // 2. Profil Fotoğrafı (resim.png)
            try {
                ImageData imageData = ImageDataFactory.create(resimYolu);
                Image profilResmi = new Image(imageData);
                profilResmi.setWidth(100);
                profilResmi.setHeight(100);
                profilResmi.setHorizontalAlignment(com.itextpdf.layout.properties.HorizontalAlignment.CENTER);
                document.add(profilResmi);
            } catch (Exception e) { // DEĞİŞİKLİK BURADA: Sadece MalformedURLException değil, tüm hataları
                                    // yakalıyoruz
                System.out.println(
                        "Uyarı: " + resimYolu + " bulunamadı veya okunamadı. Resim eklenemeden devam ediliyor.");
            }

            // 3. İletişim ve Kişisel Bilgiler
            document.add(new Paragraph(new Text("\nKİŞİSEL BİLGİLER")).setFontSize(14));
            document.add(new Paragraph("Meslek: " + cv.getMeslek()));
            document.add(new Paragraph("Telefon: " + cv.getTelefon()));
            document.add(new Paragraph("E-Posta: " + cv.getMail()));
            document.add(new Paragraph("Hakkımda: " + cv.getHakkimda()));

            // 4. İş Deneyimleri
            document.add(new Paragraph(new Text("\nİŞ DENEYİMLERİ")).setFontSize(14));
            for (Deneyim d : cv.getDeneyimler()) {
                document.add(new Paragraph("- " + d.getMeslek() + " | " + d.getSirketIsmi() + " (" + d.getCalismaSehri()
                        + ") [" + d.getYillar() + "]"));
                document.add(new Paragraph("  " + d.getIsAciklamasi()));
            }

            // 5. Eğitim Bilgileri
            document.add(new Paragraph(new Text("\nEĞİTİM BİLGİLERİ")).setFontSize(14));
            for (Egitim e : cv.getEgitimler()) {
                document.add(
                        new Paragraph("- " + e.getEgitimTuru() + " | " + e.getOkulAdi() + " [" + e.getYillar() + "]"));
            }

            // 6. Beceriler
            document.add(new Paragraph(new Text("\nBECERİLER")).setFontSize(14));
            List beceriListesi = new List();
            for (String beceri : cv.getBeceriler()) {
                beceriListesi.add(new ListItem(beceri));
            }
            document.add(beceriListesi);

            // 7. Sertifikalar
            document.add(new Paragraph(new Text("\nSERTİFİKALAR")).setFontSize(14));
            for (Sertifika s : cv.getSertifikalar()) {
                document.add(new Paragraph(
                        "- " + s.getSertifikaIsmi() + " | " + s.getAlinanYer() + " [" + s.getYillar() + "]"));
            }

            // Belgeyi kapatma ve kaydetme
            document.close();
            System.out.println("PDF Başarıyla Oluşturuldu: " + pdfDosyaAdi);

        } catch (IOException e) {
            System.out.println("PDF dosyası oluşturulurken bir hata meydana geldi: " + e.getMessage());
        }
    }
}