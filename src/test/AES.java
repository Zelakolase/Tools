package test;

import java.util.Arrays;

public class AES {
    public static void main(String[] args) throws Exception {
        tools.AES CryptObject = new tools.AES("TestPassword");
        
        System.out.println("Encrypting 'Hello' in AES256 -> " + CryptObject.encrypt("Hello"));
        System.out.println("Encrypting byte array 13, 5, 10 in AES256 -> " + Arrays.toString(CryptObject.encrypt(new byte[] {13, 5, 10})));

        System.out.println("Decrypting 'Hello' in AES256 -> " + CryptObject.decrypt(CryptObject.encrypt("Hello")));
    }
}
