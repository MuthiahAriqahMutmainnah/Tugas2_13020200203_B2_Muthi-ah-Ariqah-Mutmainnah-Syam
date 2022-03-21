/* Nama                     : MUTHI'AH ARIQAH MUTMAINNAH SYAM */
/* NIM                      : 13020200203 */
/* KELAS                    : B2 */
/* HARI/ TANGGAL DAN WAKTU  : JUMAT/ 18 MARET 11:00 */

import java.util.Scanner;

public class waktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totaljam, totalmenit, totaldetik,jamSekarang,  konversi;
        
        System.out.print("Berapa detik yang ingin anda konversikan : ");
        konversi = input.nextInt();
        
        totaljam     = konversi/3600;
        totalmenit   = (konversi%3600)/60;
        totaldetik   = (konversi%3600)%60;
        jamSekarang  = totaljam %24; 
        
        
        System.out.println("Konversi dari : "+konversi+" detik, Adalah : ");
        System.out.println(jamSekarang+" jam saat ini ");
        System.out.println(totaljam+" jam, "+totalmenit+" menit, "+totaldetik+" detik");
    }
    
    
}