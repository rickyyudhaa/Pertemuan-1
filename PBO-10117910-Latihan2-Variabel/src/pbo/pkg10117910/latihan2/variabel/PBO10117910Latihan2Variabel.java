/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : program latihan variabel java
 *
 */

package pbo.pkg10117910.latihan2.variabel;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan2Variabel {

	public static void main(String[] args) {
		//Deklarasi variable
		int nilaiInt;
		final double PHI = 3.14;
		boolean nilaiLogika;
		char nilaiKarakter;

		//Memberi nilai pada variable
		nilaiInt = 78;
		nilaiLogika = false;
		nilaiKarakter = 'A';

		//Menampilkan Hasil
		System.out.println();
		System.out.printf("Isi variable nilai\t: %d\r\n", nilaiInt);
		System.out.printf("Isi variable PHI\t: %f\r\n", PHI);
		System.out.printf("Isi variable logika\t: %b\r\n", nilaiLogika);
		System.out.printf("Isi variable karakter\t: %s\r\n", nilaiKarakter);
	}
    
}
