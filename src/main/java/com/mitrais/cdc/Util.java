package com.mitrais.cdc;

public class Util {

    public static String reverse(String string){
        if(string == null || string.length() <= 1) {
            return string;
        }
        return reverse(string.substring(1)) + string.charAt(0);
    }

    public static String intToBinary(int n){
        StringBuilder result = new StringBuilder();

        while (n > 0){
            int a = n % 2;
            result.insert(0, a);
            n = n / 2;
        }
        return result.toString();
    }
}
