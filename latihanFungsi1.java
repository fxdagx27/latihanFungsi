import java.util.Scanner;

public class latihanFungsi1 {

    static void tampilNama (int id){
            String namaPelanggan[]={"Ali","Budi","Dani","Edi","Umar"};
            System.out.println(namaPelanggan[id-1]);
        }
    
        static int hitungTarif(int jumlahPakai){
            int harga=0;
            if(jumlahPakai <10 || jumlahPakai<10){
                jumlahPakai=10;
                harga=jumlahPakai*2000;
            }
            else if(jumlahPakai>=11 && jumlahPakai<=20){
                harga =jumlahPakai*3000;
            }
            else if(jumlahPakai>=21 && jumlahPakai<=30){
                harga =jumlahPakai*4000;
            }
            else if(jumlahPakai>=31){
                harga =jumlahPakai*5000;
            }
            return harga;
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean status = true;

            do {
                System.out.println("Masukkan Id Pelanggang : ");
                int namaPelanggan = input.nextInt();
                System.out.println("Nama Pelanggan : ");
                tampilNamaPelanggan(namaPelanggan);

                System.out.println("Masukkan Banyak Pemakaian Air : ");
                int jumlahPakai = input.nextInt();
                System.out.println("Jumlah Tarif : ");
                hitungTarif(jumlahPakai);

                System.out.println("Mo nyoba lagi? boleh/engga dulu");
                String ulang = input.next();
                if (ulang.equalsIgnoreCase("n")){
                    status = false;
                } else {
                    status = true;
                }
            }while (status);

            input.close();
        }

        private static void tampilNamaPelanggan(int namaPelanggan) {
        }
    }

