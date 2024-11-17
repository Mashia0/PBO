import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String noFaktur = "";
        String kodeBarang = "";
        String namaBarang = "";
        double hargaBarang = 0;
        int jumlahBeli = 0;

        try {
            boolean validInput = false;
            
            while (!validInput) {
                System.out.print("Masukkan No Faktur: ");
                noFaktur = scanner.nextLine();
                if (noFaktur.matches("\\d+")) {
                    validInput = true;
                } else {
                    System.out.println("No Faktur harus berupa angka. Silakan coba lagi.");
                }
            }
                        
            validInput = false;
            while (!validInput) {
                System.out.print("Masukkan Kode Barang: ");
                kodeBarang = scanner.nextLine();
                if (kodeBarang.matches("\\d+")) {
                    validInput = true;
                } else {
                    System.out.println("Kode Barang harus berupa angka. Silakan coba lagi.");
                }
            }

            validInput = false;
            while (!validInput) {
                System.out.print("Masukkan Nama Barang: ");
                namaBarang = scanner.nextLine();
                if (namaBarang.matches("[a-zA-Z ]+")) {
                    validInput = true;
                } else {
                    System.out.println("Nama Barang harus berupa huruf. Silakan coba lagi.");
                }
            }
                        
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan Harga Barang: ");
                    hargaBarang = Double.parseDouble(scanner.nextLine());
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Harga Barang harus berupa angka. Silakan coba lagi.");
                }
            }
            
            validInput = false;
            while (!validInput) {
                System.out.print("Masukkan Jumlah Beli: ");
                String jumlahBeliInput = scanner.nextLine();
                if (jumlahBeliInput.matches("\\d+")) {
                    jumlahBeli = Integer.parseInt(jumlahBeliInput);
                    validInput = true;
                } else {
                    System.out.println("Jumlah Beli harus berupa angka. Silakan coba lagi.");
                }
            }
                       
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            transaksi.printTransaksi();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
