/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : program penugasan
 *
 */
package pbo.pkg10117910.latihan16.penugasan;

/**
 *
 * @author rickyyudhaa
 */
public class PBO10117910Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 0;

        System.out.println("Nilai a =  " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);

        c = a + b;
        System.out.println("c = a + b = " + c);

        c += a;
        System.out.println("c += a = " + c);

        c -= a;
        System.out.println("c -= a = " + c);

        c *= a;
        System.out.println("c *= a = " + c);

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = "+ c);

        c = 15;
        c %= a;
        System.out.println("c %%= a = " + c);

        c <<= 2;
        System.out.println("c <<= 2 = " + c);

        c >>= 2;
        System.out.println("c >>= 2 = " + c);

        c >>= 2;
        System.out.println("c >>= a = " + c);

        c &= a;
        System.out.println("c &= a = " + c);

        c ^= a;
        System.out.println("c ^= a = " + c);

        c |= a;
        System.out.println("c |= a = " + c);

    }
    
}
