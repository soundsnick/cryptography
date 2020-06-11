/*

ElGamal Encryption Algorithm

ElGamal encryption is an public-key cryptosystem. It uses asymmetric key encryption for communicating between two parties and encrypting the message.
This cryptosystem is based on the difficulty of finding discrete logarithm in a cyclic group that is even if we know ga and gk, it is extremely difficult to compute gak.


Idea of ElGamal cryptosystem
Suppose Alice wants to communicate to Bob.


Bob generates public and private key :
    Bob chooses a very large number q and a cyclic group Fq.
    From the cyclic group Fq, he choose any element g and
    an element a such that gcd(a, q) = 1.
    Then he computes h = ga.
    Bob publishes F, h = ga, q and g as his public key and retains a as private key.


Alice encrypts data using Bob’s public key :
    Alice selects an element k from cyclic group F
    such that gcd(k, q) = 1.
    Then she computes p = gk and s = hk = gak.
    She multiples s with M.
    Then she sends (p, M*s) = (gk, M*s).
   

Bob decrypts the message :
    Bob calculates s′ = pa = gak.
    He divides M*s by s′ to obtain M as s = s′.
*/

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class ElGamalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("еntеr p");
        BigInteger p = new BigInteger(scan.nextLine());
        System.out.println("еntеr g");
        BigInteger g = new BigInteger(scan.next());
        Random r = new Random();
        BigInteger a = new BigInteger(p.bitCount() - 1, r);
        BigInteger b = g.modPow(a, p);
        BigInteger k = new BigInteger(p.bitCount() - 1, r);
        BigInteger c1 = g.modPow(k, p);
        BigInteger c2 = b.modPow(k, p);

        System.out.println("еntеr your mеssаge between 1 аnd " + p);
        BigInteger m = new BigInteger(scan.next());

        c2 = c2.multiply(m);
        c2 = c2.mod(p);
        System.out.println("c1 = " + c1 + " c2 = " + c2);
        BigInteger t = c1.modPow(a, p);
        t = t.modInverse(p);
        System.out.println(t);
        BigInteger o = t.multiply(c2);
        o = o.mod(p);
        System.out.println("o mеssаgе = " + o);
    }
}