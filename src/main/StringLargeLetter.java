package main;

import java.util.Scanner;

/**
 * Created by dengshougang on 16/3/23.
 */
public class StringLargeLetter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String result="";
        for (int i=0;i<s.length();i++){
            if (s.codePointAt(i)>='A'&&s.codePointAt(i)<='Z'){
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
