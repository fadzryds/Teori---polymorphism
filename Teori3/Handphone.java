class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    // Metode untuk menyalakan handphone
    public void nyalakan() {
        System.out.println(merk + " " + model + " menyala.");
    }

    // Metode untuk mematikan handphone
    public void matikan() {
        System.out.println(merk + " " + model + " mati.");
    }

    // Metode untuk mengirim pesan ke satu nomor
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan + ": " + pesan);
    }

    // Metode untuk mengirim pesan ke dua nomor
    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Mengirim pesan ke " + nomorTujuan1 + " dan " + nomorTujuan2 + ": " + pesan);
    }

    // Metode untuk mengirim pesan ke daftar nomor
    public void kirimPesan(String[] daftarNomor, String pesan) {
        for (String nomor : daftarNomor) {
            System.out.println("Mengirim pesan ke " + nomor + ": " + pesan);
        }
    }
}