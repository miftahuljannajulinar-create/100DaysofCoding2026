import java.util.Scanner; //Mengimpor Scanner untuk membaca input dari pengguna
public class BiodataScanner {
    public static void main(String[] args) {
//Membuat objek Scanner untuk menerima input dari keyboard
Scanner input = new Scanner(System.in);
//Meminta seorang pengguna untuk memasukkan Namanya
System.out.print("Nama:");
String nama = input.nextLine();
//Meminta seorang pengguna untuk memasukan Kelas
System.out.print("Kelas:");
String kelas = input.nextLine();
//Meminta seorang pengguna untuk memasukkan sebuah Program studi
System.out.print("Program studi:");
String prodi = input.nextLine();

//Menampilkan biodata yang sudah dimasukkan
System.out.println("\n===BIODATA===");
System.out.println("Nama : " + nama);
System.out.println("Kelas : " + kelas);
System.out.println("Program studi : " + prodi);
//Menutup Scanner setelah selesai digunakan
input.close();

    }
}
