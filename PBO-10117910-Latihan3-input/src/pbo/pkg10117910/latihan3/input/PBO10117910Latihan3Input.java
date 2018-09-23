/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : program input dari keyboard
 *
 */
package pbo.pkg10117910.latihan3.input;
import java.util.Scanner;
/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Masukan Nama anda\t: ");
	        String name = scanner.nextLine();

	        System.out.println("Nama anda adalah\t: " + name);
	    }
    
}
