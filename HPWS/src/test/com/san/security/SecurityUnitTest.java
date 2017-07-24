package com.san.security;

public class SecurityUnitTest {
//j4f8LMpitD2tr2JncDwV7exjkzwajpl8GPSSKTgifm23AoN7eTYo4XkUZylGzrhyW7fynXny/i6Jf0DiXrcTHKLfKVMxPR+/bJyg5PxRAAf0pba0N7P9HuU4+95jr5E7K5s6St5ZKdc09Z0MXEFdCw==
    public void encryptDecrypt() {
        Security security = new Security();
        String encrypted = security.encryptAES(
                "{" +
                        "\"id\":\"1\"," +
                        "\"access_token\":\"qwerty\"," +
                        "\"role\":\"ADMIN\"," +
                        "\"ip\":\"0:0:0:0:0:0:0:1\"," +
                        "\"agent\":\"PostmanRuntime/6.1.6\"" +
                        "}");
        String decrypted = security.decryptAES(encrypted);
        System.out.println(encrypted);
        System.out.println(decrypted);
    }

    public static void main(String args[]) {
        SecurityUnitTest test = new SecurityUnitTest();
        test.encryptDecrypt();
    }
}
