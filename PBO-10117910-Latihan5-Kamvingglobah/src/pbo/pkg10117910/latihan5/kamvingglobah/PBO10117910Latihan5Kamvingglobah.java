/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : program kambing global
 *
 */
package pbo.pkg10117910.latihan5.kamvingglobah;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan5Kamvingglobah {

   
    //Inisialisasi nilai kambing
    int currentKambing = 60;

    //Menampilkan jumlah kambing yang ada
    public void getKambing() {
        System.out.printf("Jumlah Kambing: %d\r\n", currentKambing);
    }

    //Menambah dan menampilkan jumlah kambing
    public void addKambing() {

        currentKambing = currentKambing + 5;

        System.out.printf("Jumlah Kambing setelah ditambah: %d\r\n", currentKambing);
    }

    public static void main(String[] args) {
        PBO10117910Latihan5Kamvingglobah kambing = new PBO10117910Latihan5Kamvingglobah();
        kambing.getKambing();
        kambing.addKambing();
        kambing.getKambing();

    }
    
}
