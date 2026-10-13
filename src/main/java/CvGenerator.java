import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.io.image.ImageDataFactory;

public class CvGenerator {
    // Erişim düzenleyici: private (Encapsulation)
    private String adSoyad;
    private String okul;
    private String numara;

    // Nesne yaşam döngüsü başlangıcı: Constructor
    public CvGenerator() {
        this.adSoyad = "Eren Erden";
        this.okul = "Kirklareli Universitesi - Yazilim Muhendisligi";
        this.numara = "1250505052";
    }

    public void pdfOlustur(String dosyaYolu, String fotoYolu) {
        try {
            PdfWriter writer = new PdfWriter(dosyaYolu);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            document.add(new Paragraph("OZGECMIS").setBold().setFontSize(20));
            
            try {
                Image foto = new Image(ImageDataFactory.create(fotoYolu));
                foto.setWidth(100);
                document.add(foto);
            } catch (Exception e) {
                document.add(new Paragraph("[Fotograf Bulunamadi - photo.jpg eklenmeli]"));
            }

            document.add(new Paragraph("\nKisisel Bilgiler").setBold().setFontSize(14));
            document.add(new Paragraph("Ad Soyad: " + adSoyad));
            document.add(new Paragraph("Egitim: " + okul));
            document.add(new Paragraph("Ogrenci No: " + numara));

            document.add(new Paragraph("\nIs Deneyimleri").setBold().setFontSize(14));
            document.add(new Paragraph("1. Sistem Gelistirici Stajyeri - Tech A.S. (2022-2023)\n- Java ile C tabanli bagli liste algoritmalarinin entegrasyon testleri."));
            document.add(new Paragraph("2. Junior Backend Developer - Kirklareli Bilisim (2025-2026)\n- Veritabani optimizasyonu ve API Gateway tasarimlari."));
            document.add(new Paragraph("3. Freelance Yazilim Uzmani - Global IT (2026-Gunumuz)\n- Sistem kayitlarinin loglanmasi ve mikroservis mimarisi gelistirme."));

            document.close();
            System.out.println("PDF olusturuldu: " + dosyaYolu);
        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}