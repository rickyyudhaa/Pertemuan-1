/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : program formating
 *
 */
package pbo.pkg10117910.latihan11.formating;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan11Formating {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        int v = 3546764;
        int vMinus = -v;

        System.out.printf("value: %d\r\n", v);
        System.out.printf("%%d: %d\r\n", v);
        System.out.printf("%%10d: %10d\r\n", v);
        System.out.printf("%%+10d: %+10d\r\n", v);
        System.out.printf("%%+10d: %+10d\r\n", vMinus);
        System.out.printf("%%,10d: %,10d\r\n", v);
        System.out.printf("%%-10d: %-10d\r\n", v);

        double vDouble = 12131998.123;

        System.out.printf("valueDouble: %f\r\n", vDouble);
        System.out.printf("%%f: %f\r\n", vDouble);
        System.out.printf("%%.2f: %.2f\r\n", vDouble);
        System.out.printf("%%12.2f: %12.2f\r\n", vDouble);
        System.out.printf("%%,12.2f: %,12.2f\r\n", vDouble);

    }
    
}
