/* Nama                     : MUTHI'AH ARIQAH MUTMAINNAH SYAM */
/* NIM                      : 13020200203 */
/* KELAS                    : B2 */
/* HARI/ TANGGAL DAN WAKTU  : JUMAT/ 18 MARET 11:00 */

import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan while (ringkas) */
public class PrintWhile1 {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
int N;
int i = 1;
Scanner masukan = new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = "); 
N = masukan.nextInt();
System.out.print ("Print i dengan WHILE (ringkas): \n"); 
while (i <= N){
System.out.println (i++); 
} /* (i > N)*/
}
}