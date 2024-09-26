class FeaturePhone extends Handphone {
    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    // Override metode nyalakan
    @Override
    public void nyalakan() {
        System.out.println(merk + " " + model + " (FeaturePhone) menyala.");
    }

    // Override metode matikan
    @Override
    public void matikan() {
        System.out.println(merk + " " + model + " (FeaturePhone) mati.");
    }

    // Metode untuk memainkan game Snake
    public void mainGameSnake() {
        System.out.println("Memainkan game Snake di " + merk + " " + model);
    }
}