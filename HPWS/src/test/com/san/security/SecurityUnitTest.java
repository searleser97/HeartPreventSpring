package com.san.security;

import java.util.Scanner;

public class SecurityUnitTest {
    Security security = new Security();
    public void encryptDecrypt() {

        String encrypted = security.encryptAES(
                "{" +
                        "\"id\":1," +
                        "\"access_token\":\"myaccess_token\"," +
                        "\"roles\":[\"USER\",\"DOCTOR\"]," +
                        "\"ip\":\"0:0:0:0:0:0:0:1\"," +
                        "\"agent\":\"PostmanRuntime/6.2.5\"," +
                        "\"language\":\"esMX\"" +
                        "}");
        String decrypted = security.decryptAES(encrypted);
        System.out.println(encrypted);
        System.out.println(decrypted);
    }

    public void decrypt(String encrypted) {
        System.out.println(security.decryptAES(encrypted));
    }

    public static void main(String args[]) {
        SecurityUnitTest test = new SecurityUnitTest();
        Scanner sc = new Scanner(System.in);
//        test.encryptDecrypt();
        System.out.println("Paste encrypted token below to decrypt it and see its contents.");
        test.decrypt(sc.nextLine());
    }
}