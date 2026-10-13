# Java ile Nesne Yönelimli PDF Özgeçmiş (CV) Oluşturucu

Bu proje, Java programlama dili ve Nesne Yönelimli Programlama (OOP) prensipleri kullanılarak tasarlanmış modüler bir PDF özgeçmiş oluşturma uygulamasıdır. Projede iş mantığı ve PDF üretim süreçleri birbirinden ayrılarak sürdürülebilir bir mimari hedeflenmiştir.

## 🚀 Kullanılan Teknolojiler ve Mimari
* **Dil:** Java
* **Proje Yönetimi:** Maven (`pom.xml` üzerinden bağımlılıklar yönetilmiştir.)
* **PDF Kütüphanesi:** Projeye entegre edilen PDF kütüphanesi (iText/PDFBox).

## 🧩 Sınıflar ve Nesne Kullanımı Nedenleri

Proje, monolitik ve karmaşık bir `main` metodu yerine sorumlulukların ayrıldığı sınıflara (Separation of Concerns) bölünmüştür:

1. **`CvGenerator.java` Sınıfı:** PDF üretim sürecinin (görsellerin eklenmesi, font ayarları, veri formatlama) tüm sorumluluğunu üstlenen sınıftır. Bu işlemlerin tek bir sınıfa kapsüllenmesi (Encapsulation), "Single Responsibility" (Tek Sorumluluk) prensibine uymaktadır. Ayrı bir sınıf yapılması sayesinde gelecekte farklı tasarımlar (örn. farklı bir CV şablonu) eklenmek istendiğinde ana kodlara dokunulmadan sadece bu jeneratör güncellenebilir.
2. **`Main.java` Sınıfı:** Nesnelerin yaşam döngüsünün başlatıldığı (Instantiation) ve test verilerinin belleğe yüklendiği ana çalıştırıcıdır. Sadece veriyi hazırlar ve `CvGenerator` nesnesine iletir.
3. **Kişisel Veriler ve İş Deneyimleri:** Kod içerisinde hayali iş deneyimleri koleksiyonlar halinde tutulmuş ve ilgili nesne özelliklerine aktarılmıştır.

## 🛠️ Kurulum ve Çalıştırma

1. Projeyi bilgisayarınıza indirin (Clone).
2. Projeyi kullandığınız IDE'de (IntelliJ IDEA, Eclipse vb.) bir **Maven Projesi** olarak açın. `pom.xml` dosyası kütüphaneleri otomatik çekecektir.
3. `photo.jpg` dosyasının proje dizininde olduğundan emin olun.
4. `Main.java` sınıfını çalıştırın.
5. Proje başarıyla çalıştığında dizinde `Eren_Erden_CV.pdf` adlı dosya otomatik olarak oluşturulacaktır.
