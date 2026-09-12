import java.util.Scanner; // Mengimpor Scanner untuk menerima input dari keyboard
public class ContohScanner {
    public static void main(String[] args) {
    // Membuat sebuah objek Scanner untuk membaca input dari keyboard
    Scanner Sc = new Scanner(System.in);
    // Meminta pengguna memasukan nama
    System.out.print("Nama: ");
    // Membaca nama yang diketik oleh pengguna
    String nama = Sc.nextLine();
    // Menampilkan nama yang telah dimasukkan
    System.out.println("Nama saya adalah: " + nama);
    // Menutup Scanner setelah selesai digunakan
    Sc.close();
    }
}
