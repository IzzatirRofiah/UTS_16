import java.util.Scanner;

public class HitungIP16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        String namaMahasiswa, namaMataKuliah, nilai, konf="y";
        double IP=0.0, totalIPSKS = 0, indeksNilai = 0.0;
        int jumlahMataKuliah=0, sks, totalSKS = 0, jumlahRemidi = 0;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = input16.nextLine();
        do {

            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah = input16.nextLine();

            System.out.print("Nilai (A, B+, B, C+, C, D, E): ");
            nilai = input16.nextLine();

            switch (nilai) {
                case "A":
                    indeksNilai = 4.0;
                    break;
                case "B+":
                    indeksNilai = 3.5;
                    break;
                case "B":
                    indeksNilai = 3.0;
                    break;
                case "C+":
                    indeksNilai = 2.5;
                    break;
                case "C":
                    indeksNilai = 2.0;
                    break;
                case "D":
                    indeksNilai = 1.0;
                    jumlahRemidi++;
                    break;
                case "E":
                    indeksNilai = 0.0;
                    jumlahRemidi++;
                    break;
                default:
                    System.out.println("Nilai tidak valid. Nilai diabaikan.");
                    continue; 
            }
            System.out.print("SKS: ");
            sks = input16.nextInt();
            
            totalIPSKS += indeksNilai * sks;
            totalSKS += sks;
            jumlahMataKuliah++;

            input16.nextLine();

            System.out.print("Apakah lanjut input nilai (Y/N): ");
            konf = input16.nextLine().toUpperCase();
        }while (konf.equalsIgnoreCase("y"));
            
        if (totalSKS>0) {
            IP = totalIPSKS / totalSKS;
        }
        System.out.println();

        System.out.println("===== Hasil Perhitungan IP =====");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + IP);
        System.out.println("Total Mata Kuliah: " + jumlahMataKuliah);
        System.out.println("Total SKS: " + totalSKS);
        System.out.println("Jumlah Mata Kuliah yang harus perbaikan/remidi: " + jumlahRemidi);

        input16.close();
    }
}