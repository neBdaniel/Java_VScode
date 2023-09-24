package DSA_activities;

import java.util.Scanner;

/** Class for doing encryption and decryption using the Caesar Cipher */
public class Caesar {
    public static final int ALPHASIZE = 26; // English alphabet (uppercase only)
    public static final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    protected char[] encrypt = new char[ALPHASIZE]; // Encryption array
    protected char[] decrypt = new char[ALPHASIZE]; // Decryption array

    /** Constructor that initializes the encryption and decryption arrays */
    public Caesar() {
        for (int i = 0; i < ALPHASIZE; i++)
            encrypt[i] = alpha[(i + 3) % ALPHASIZE]; // rotate alphabet by 3 places
        for (int i = 0; i < ALPHASIZE; i++)
            decrypt[encrypt[i] - 'A'] = alpha[i]; // decrypt is reverse of encrypt
    }

    /** Encryption method */
    public String encrypt(String secret) {
        char[] mess = secret.toCharArray(); // the message array
        for (int i = 0; i < mess.length; i++)   // encryption loop
            if (Character.isUpperCase(mess[i])) // we have a letter to change
                mess[i] = encrypt[mess[i] - 'A']; // use letter as an index
        return new String(mess);
    }

    /** Decryption method */
    public String decrypt(String secret) {
        char[] mess = secret.toCharArray(); // the message array
        for (int i = 0; i < mess.length; i++)   // decryption loop
            if (Character.isUpperCase(mess[i])) // we have a letter to change
                mess[i] = decrypt[mess[i] - 'A']; // use letter as an index
        return new String(mess);
    }

    /** Simple main method for testing the Caesar Cipher */
    public static void main(String[] args) {
        Caesar cipher = new Caesar();
        System.out.println("Encryption order = " + new String(cipher.encrypt));
        System.out.println("Decryption order = " + new String(cipher.decrypt));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine();

        String ciphertext = cipher.encrypt(plaintext);
        System.out.println("Encrypted text: " + ciphertext);

        String decryptedText = cipher.decrypt(ciphertext);
        System.out.println("Decrypted text: " + decryptedText);

        scanner.close();
    }
}

