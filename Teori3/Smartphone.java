class Smartphone extends Handphone {

    // Konstruktor
    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    // Override metode nyalakan
    @Override
    public void nyalakan() {
        System.out.println(merk + " " + model + " (Smartphone) menyala.");
    }

    // Override metode matikan
    @Override
    public void matikan() {
        System.out.println(merk + " " + model + " (Smartphone) mati.");
    }

    // Override metode kirim pesan
    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan via internet ke " + nomorTujuan + ": " + pesan);
    }

    // Overload metode kirim pesan dengan email
    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mengirim email ke " + emailTujuan + " dengan subjek: " + subjek + " dan pesan: " + pesan);
    }

    // Metode tambahan untuk akses internet
    public void aksesInternet() {
        System.out.println("Mengakses internet dengan " + merk + " " + model);
    }
}