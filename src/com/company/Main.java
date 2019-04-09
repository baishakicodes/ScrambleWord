package com.company;

public class Main {
    public static String scrambleWord(String word){
        String newStr="";
        int x =0;
        for(int i=0; i<word.length()-1;){
            if(word.substring(i, i+2).equals("AA") && !word.substring(i+2, i+3).equals("A")){
                newStr= newStr + "A" + word.substring(i+2, i+3) + "A";
                i= i+3;
                x=i;
            }
            else if(word.substring(i, i+1).equals("A")){
                newStr = newStr+ word.substring(i+1, i+2)+ "A";
                i=i+2;
                x=i;
            }
            else{
                newStr = newStr+ word.substring(i, i+1);
                i++;
                x=i;
            }
        }
        if (word.length() != newStr.length()) {
            newStr = newStr +word.substring(x, word.length());
        }
        return newStr;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("EGGS"));
    }
}
