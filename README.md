# Java PDF Özgeçmiş (CV) Oluşturucu

Bu proje, Nesne Yönelimli Programlama (OOP) prensipleri kullanılarak geliştirilmiş, girilen kişisel bilgileri, eğitim, deneyim ve sertifika verilerini PDF formatında bir özgeçmişe dönüştüren bir Java uygulamasıdır. Proje, yapılandırma ve bağımlılık yönetimi için Maven kullanılarak oluşturulmuştur.

## 🏗️ Kullanılan Teknolojiler ve Kütüphaneler
* **Programlama Dili:** Java
* **Proje Yönetimi:** Maven
* **Harici Kütüphane:** iText (v9.8.0) - PDF belgesini tasarlamak, metinleri ve fotoğrafları belgeye yazdırmak için kullanılmıştır.

## 🧩 Kullanılan Nesneler ve Sınıf Mimarisi
Projede verileri düzenli tutmak, modülerliği sağlamak ve kapsülleme (encapsulation) kurallarına uymak amacıyla farklı sınıflar oluşturulmuştur:

* **`CV.java`**: Özgeçmişin ana iskeletidir. Temel iletişim bilgilerini tutmanın yanı sıra, `List` yapıları sayesinde deneyim, eğitim ve sertifika gibi diğer nesneleri kendi içinde barındırır (Composition). Nitelikler `private` tutulmuş, veri erişimi `getter/setter` metotlarıyla sağlanmıştır.
* **`Deneyim.java`, `Egitim.java`, `Sertifika.java`**: Özgeçmişteki tekrarlanan veri bloklarını modelleyen sınıflardır. Örneğin bir iş deneyiminin (şirket adı, çalışma yılları, açıklama) tek bir metin yerine nesne olarak tutulması, kodun yönetilebilirliğini artırmıştır.
* **`PDFYazdir.java`**: PDF'e dönüştürme görevi `Main` sınıfının içinden çıkarılmış ve Tek Sorumluluk Prensibi (Single Responsibility) gereği bu sınıfa devredilmiştir. İçerisinde iText kütüphanesine ait `PdfWriter`, `PdfDocument` ve `Document` nesneleri kullanılarak belgenin fiziksel olarak oluşturulması, şekillendirilmesi (bold metinler, resim ekleme) ve Türkçe karakter (`CP1254`) desteğinin sağlanması işlemleri gerçekleştirilir.
* **`Main.java`**: Uygulamanın çalıştırıldığı ana (driver) sınıftır. Gerekli nesneler burada bellekte yaratılmış (`new` anahtar kelimesi ile), verilerle doldurulmuş ve `PDFYazdir` sınıfı çağrılarak çıktı alınmıştır.

## 📸 Proje İsterleri (Gereksinimler)
* Uygulama konsol tabanlıdır, grafiksel arayüz (GUI) içermemektedir.
* Özgeçmiş PDF çıktısında başarıyla bir adet profil fotoğrafı (`resim.png`) barındırmaktadır.
* Projede kural gereği 3 farklı kurgusal iş deneyimi nesnesi oluşturulup PDF'e yansıtılmıştır.
* Çıktı işlemleri ana metodun dışında, `PDFYazdir` isimli ayrı bir sınıfta ele alınmıştır.

## 🤖 Yapay Zeka (LLM) Kullanımı
Bu projenin geliştirme ve hata ayıklama (debugging) sürecinde **Google Gemini** dil modelinden faydalanılmıştır. Yapay zekanın projeye katkıları şu şekildedir:
1. Temel Java sınıfları ve OOP iskeleti manuel olarak kurulduktan sonra, **iText 9.8.0** kütüphanesinin güncel kullanımı hakkında syntax (sözdizimi) yardımı alınmıştır.
2. iText'te metinlerin kalın (bold) yazdırılması sırasında karşılaşılan uyumsuzluklar, metinlerin `Text` nesnesi içine alınması yöntemiyle yapay zeka yönlendirmesi sayesinde çözülmüştür.
3. PDF oluşturulurken "ş, ğ, ı, İ, ç, ö, ü" gibi Türkçe karakterlerin belgede görünmemesi sorunu, Gemini'nin önerisiyle `CP1254` kodlamasına sahip `StandardFonts.HELVETICA` fontunun projeye entegre edilmesiyle giderilmiştir.
4. Resim dosyasının yolu okunamadığında projenin yarıda kesilip bozuk PDF üretmesini engellemek amacıyla, `try-catch` bloklarının optimizasyonu konusunda asistan olarak kullanılmıştır.

## 🚀 Kurulum ve Çalıştırma

Projeyi yerel bilgisayarınızda (local) çalıştırmak için aşağıdaki adımları izleyebilirsiniz.

### Ön Koşullar
* Bilgisayarınızda **Java JDK** (Tercihen 17 veya üzeri) kurulu olmalıdır.
* Proje bağımlılıklarını yönetmek için **Apache Maven** kurulu olmalıdır.
* Kodları çalıştırmak için bir IDE (VS Code, IntelliJ IDEA veya Eclipse) kullanılması tavsiye edilir.

### Adımlar

1. **Projeyi Klonlayın:**
   Terminal veya komut satırını açarak projeyi bilgisayarınıza indirin:
   ```bash
   git clone https://github.com/b-Demir/CV-Generator.git
   cd CV-Generator
   ```