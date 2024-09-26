public class Main {
    public static void main(String[] args) {
        // Membuat objek Smartphone
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");
        smartphone.nyalakan();
        smartphone.kirimPesan("082258847225", "Halo, ini pesan dari smartphone.");
        smartphone.kirimPesan("fadzry1603@gmail.com", "Contoh email", "Halo, ini email dari smartphone.");
        smartphone.aksesInternet();
        smartphone.matikan();

        // Membuat objek FeaturePhone
        FeaturePhone featurePhone = new FeaturePhone("Nokia", "3310");
        featurePhone.nyalakan();
        featurePhone.mainGameSnake();
        featurePhone.kirimPesan("082258847225", "Halo, ini pesan dari feature phone.");
        featurePhone.matikan();
    }
}
