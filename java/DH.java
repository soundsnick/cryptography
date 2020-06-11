/*

Implementation of Diffie-Hellman Algorithm

The Diffie-Hellman algorithm is being used to establish a shared secret that can be used for secret
communications while exchanging data over a public network using the elliptic curve to generate points and get the secret key using the parameters.

For the sake of simplicity and practical implementation of the algorithm, we will consider only 4 variables one prime P and G (a primitive root of P) and two private values a and b.
P and G are both publicly available numbers. Users (say Alice and Bob) pick private values a and b and they generate a key and exchange it publicly, the opposite person received the key and from that generates a secret key after which they have the same secret key to encrypt.

*/

import java.math.BigInteger;
import java.util.Scanner;

class DH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("еnter prime number:");
        BigInteger p = new BigInteger(scan.nextLine());
        System.out.print("еnter root of " + p + ":");

        BigInteger g = new BigInteger(scan.nextLine());
        System.out.println("еnter X less than " + p + ":");

        BigInteger x = new BigInteger(scan.nextLine());
        BigInteger R1 = g.modPow(x, p);
        System.out.println("R1=" + R1);
        System.out.print("еnter Y less than " + p + ":");

        BigInteger y = new BigInteger(scan.nextLine());
        BigInteger R2 = g.modPow(y, p);
        temp(p, x, R1, y, R2);
    }

    static void temp(BigInteger p, BigInteger x, BigInteger r1, BigInteger y, BigInteger r2) {
        System.out.println("R2=" + r2);
        BigInteger k1 = r2.modPow(x, p);
        System.out.println("first key:" + k1);
        BigInteger k2 = r1.modPow(y, p);
        System.out.println("second key:" + k2);
    }
}