package io.github.jadeoti.strings;

import java.util.HashMap;

public class IsCharacterRepeatedInString {
    public static void main(String[] args) {
        System.out.println('A' - 65);
        System.out.println(checkUniqueness2("addeoti"));
        System.out.println(checkUniqueness("addeoti"));
        System.out.println(checkUniqueness2("adeoti"));
        System.out.println(checkUniqueness("adeoti"));
    }

    public static boolean checkUniqueness(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else {
                int count = map.get(c);
                if(count == 1) return true;
            }
        }

        return false;
    }


    public static boolean checkUniqueness2(String s){
        char[] map = new char[256];
        for(char c : s.toCharArray()){
            map[c]++;
            System.out.println(map[c]);
            if(map[c] > 1)
                return false;
        }
        return true;
    }
}
