/*
 * Author Name : Vishad Raj Vashishtha
 * IDE: IntelliJ IDEA Community Edition
 * Date: 06-09-2022
 */

import java.util.HashMap;
import java.util.Scanner;

public class GetCommonElements2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st Array :- ");
        int n1 = input.nextInt();
        int [] a1 = new int[n1];
        for(int i =0; i<a1.length; i++){
            a1[i] = input.nextInt();
        }

        System.out.println("Enter 2nd Array :- ");
        int n2 = input.nextInt();
        int [] a2 = new int[n2];
        for(int i=0; i<a2.length;i++){
            a2[i] = input.nextInt();
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int val : a1){
            if(hashMap.containsKey(val)){
                int of = hashMap.get(val);
                int nf = of +1;
                hashMap.put(val, nf);
            } else{
                hashMap.put(val,1);
            }
        }

        for(int val: a2){
            if(hashMap.containsKey(val) &&  hashMap.get(val) >0 ){
                System.out.println(val);
                int of = hashMap.get(val);
                int nf = of -1;
                hashMap.put(val , nf);
            }
        }

    }
}
