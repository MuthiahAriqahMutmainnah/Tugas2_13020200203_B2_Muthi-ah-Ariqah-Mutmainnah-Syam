/* Nama                     : MUTHI'AH ARIQAH MUTMAINNAH SYAM */
/* NIM                      : 13020200203 */
/* KELAS                    : B2 */
/* HARI/ TANGGAL DAN WAKTU  : JUMAT/ 18 MARET 11:00 */

public class Oprator {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
boolean Bool1, Bool2, TF ; int i,j, hsl ;
float x,y,res; 
/* algoritma */
System.out.println ("Silahkan baca teksnya dan  tambahkan perintah untuk menampilkan output");
System.out.println ("Operasi Logical Bool");
Bool1 = true; Bool2 = false;
TF = Bool1 && Bool2;
System.out.println ("Bool1 && Bool2 = " + TF );
TF = Bool1 || Bool2; 
System.out.println ("Bool1 || Bool2 = " + TF );
TF = ! Bool1;
System.out.println ("!Bool1         = " + TF ); 
TF = Bool1 ^Bool2;
System.out.println ("Bool1 ^Bool2   = " + TF ); 


System.out.println ("Operasi Numerik");
i = 5; j = 2 ;
hsl = i+j; 
System.out.println ("i + j = " + hsl );
hsl = i - j;
System.out.println ("i - j = " + hsl );
hsl = i / j;
System.out.println ("i / j = " + hsl );
hsl = i * j;
System.out.println ("i * j = " + hsl );
hsl = i /j ;
System.out.println ("i / j = " + hsl );
hsl = i%j;
System.out.println ("i % j = " + hsl );


System.out.println ("Operasi Numerik");
x = 5 ; y = 5 ;
res = x + y; 
System.out.println ("x + y = " + res );
res = x - y;
System.out.println ("x - y = " + res );
res = x / y;
System.out.println ("x / y = " + res );
res = x * y;
System.out.println ("x + y = " + res );

System.out.println ("Operasi Relasional Numerik");
TF = (i==j);
System.out.println ("i == j  = " + TF );
TF = (i!=j);
System.out.println ("i != j  = " + TF );
TF = (i < j);
System.out.println ("i < j  = " + TF );
TF = (i > j); 
System.out.println ("i > j  = " + TF );
TF = (i <= j);
System.out.println ("i <= j  = " + TF );
TF = (i >= j);
System.out.println ("i >= j  = " + TF );

System.out.println ("Operasi Relasional Numerik");
TF = (x != y);
System.out.println ("x != y  = " + TF );
TF = (x < y);
System.out.println ("x < y  = " + TF );
TF = (x > y);
System.out.println ("x > y  = " + TF );
TF = (x <= y); 
System.out.println ("x <= y  = " + TF );
TF = (x >= y);
System.out.println ("x >= y  = " + TF );
}
}