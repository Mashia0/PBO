public class Transaksi extends Barang {
    private int jumlahBeli;
    private double total;
    private String noFaktur;

    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        calculateTotal();
    }

    private void calculateTotal() {
        try {
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0");
            }
            this.total = this.hargaBarang * jumlahBeli; // Direct access to protected field
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.total = 0;
        }
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public double getTotal() {
        return total;
    }

    public void printTransaksi() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Kode Barang: " + getKodeBarang());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga Barang: " + hargaBarang); // Direct access to protected field
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: " + total);
    }
}
