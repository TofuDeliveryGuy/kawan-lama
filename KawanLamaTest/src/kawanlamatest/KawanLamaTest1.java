package kawanlamatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class KawanLamaTest1 {
    public static void main(String[] args) {
        String str = "SIAPA";
//        String strPool = "USOMAANAPAIUMASYDNIP";
        
        //get strPool from User input( this case,assume user gives valid String input)
        System.out.println("Enter your String Pool to form \"SIAPA\" String:");
        Scanner sc = new Scanner(System.in);
        String strPool = sc.nextLine();
        strPool = strPool.toUpperCase();
        //to get the minimum char needed to form the str "SIAPA" 
        //by counting how many occurences per chars for further comparison to strOccurences
        HashMap<Character,Integer> possibleCharCount = new HashMap<Character,Integer>();
        
        //get all chars related to "SIAPA" which are S I A and P, 
        //then divide them with num of occurences on possibleStrCount then get the minimum number as the answer
        HashMap<Character,Integer> charOccurences = new HashMap<Character,Integer>();
        
        char[] strToChar = str.toCharArray();
        for(char c : strToChar){
            //we need to initiate strOccurences to avoid uninitiated chars
            charOccurences.put(c, 0);
            //then count the occurences for the required chars to form SIAPA
            if(!possibleCharCount.containsKey(c)){
                possibleCharCount.put(c, 1);
            }
            else{
                possibleCharCount.put(c, possibleCharCount.get(c)+1);
            }
        }
        //get all required chars occurences from the pool
        char[] strPoolToChar = strPool.toCharArray();
        for(char cPool: strPoolToChar){
            if(charOccurences.containsKey(cPool)){
                charOccurences.put(cPool, charOccurences.get(cPool)+1);
            }
        }
        
        System.out.println(charOccurences);
        //then update the charOccurences by divide each char with amount on chars from possibleCharCount
        for(char cFinal : charOccurences.keySet()){
            charOccurences.put(
                    cFinal, 
                    charOccurences.get(cFinal)/possibleCharCount.get(cFinal)
            );
        }
        int ans = Collections.min(charOccurences.values());
        
        System.out.println("Number of \"SIAPA\" strings can be formed are: "+ans+" times");
        
    }
    
}
