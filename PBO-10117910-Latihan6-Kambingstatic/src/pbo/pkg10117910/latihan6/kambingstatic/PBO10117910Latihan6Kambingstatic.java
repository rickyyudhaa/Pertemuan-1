/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : kambing static
 *
 */
package pbo.pkg10117910.latihan6.kambingstatic;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan6Kambingstatic {

    //nama pemilik kambing
    public static final String namaPemilik = "Paluluman";

    public static void main(String[] args) {
        Mamalia.jumlahKambing = 5000;
        System.out.printf("%s memiliki kambing sebanyak %d\r\n", namaPemilik, Mamalia.jumlahKambing);

    }
}

class Mamalia {
    public static int jumlahKambing;
}