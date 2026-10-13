public class Main {
    public static void main(String[] args) {
        // Nesne bellekte new ile yaratılır
        CvGenerator cvUretici = new CvGenerator();
        
        String pdfYolu = "Eren_Erden_CV.pdf";
        String fotoYolu = "photo.jpg"; 
        
        cvUretici.pdfOlustur(pdfYolu, fotoYolu);
        // Metot bitiminde nesne Garbage Collector tarafından silinir
    }
}