/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 06-09-2022
 */

import java.util.HashMap;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine();
        char ans = getFrequency(userString);
        System.out.println(ans);

    }
    public static char getFrequency(String str){
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hashMap.containsKey(ch)){
                int of = hashMap.get(ch);
                int nf = of +1;
                hashMap.put(ch, nf);
            } else {
                hashMap.put(ch, 1);
            }
        }

        char mfc = str.charAt(0);
        for (Character key : hashMap.keySet()) {
            if(hashMap.get(key) > hashMap.get(mfc)){
                mfc = key;
            }
        }
        return mfc;
    }
}
