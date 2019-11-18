package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DesCipher DesCipher=new DesCipher(2,"0110","1010");
        String x=DesCipher.encrypt("01101100");
        System.out.println(x);
        String y=DesCipher.decrypt(x);
        System.out.println(y);
    }
}
